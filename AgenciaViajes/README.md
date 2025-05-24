# Agencia de Viajes - API REST con Spring Boot

## Descripción general

Este proyecto es una API REST construida con **Spring Boot** para gestionar una agencia de viajes. Permite la gestión completa de hoteles, vuelos y reservas asociadas a estos servicios. Es una arquitectura típica de aplicación backend con capa de persistencia, negocio y presentación (API REST).

---

## Arquitectura y Diseño

El proyecto sigue una arquitectura en capas:

- **Capa de Modelo (Entities):** Define las entidades principales `Hotel`, `Vuelo`, `Reserva`, que representan las tablas en la base de datos.
- **Capa DTO:** Utilizada para el intercambio de datos, especialmente para crear reservas con `ReservaRequest`. Facilita la validación y desacopla el modelo de la API.
- **Capa Repositorio:** Interfaces que extienden `JpaRepository` para CRUD automático y consultas básicas con JPA/Hibernate.
- **Capa Servicio:** Contiene la lógica de negocio. Maneja operaciones como creación, obtención y eliminación de entidades, y la asociación entre reservas, vuelos y hoteles.
- **Capa Controlador:** Exposición de los endpoints REST que consumen y producen JSON. Aquí se gestionan las solicitudes HTTP y se delega en los servicios.

---

## Tecnologías y Librerías

- **Java 21**: Lenguaje principal.
- **Spring Boot 3.x**: Framework para construir APIs REST.
- **Spring Data JPA**: Para acceso simplificado a bases de datos usando JPA/Hibernate.
- **Jakarta Validation (Bean Validation)**: Para validar las entradas de los DTOs y entidades con anotaciones.
- **Base de datos SQL**: MySQL.
- **Maven o Gradle**: Para la gestión de dependencias y build.

---

## Entidades y Modelado de Datos

### Hotel

Representa un hotel con atributos clave para la reserva:

| Campo           | Tipo    | Restricciones                    |
|-----------------|---------|---------------------------------|
| `id`            | Long    | PK, auto generado               |
| `nombre`        | String  | No nulo, no vacío               |
| `categoria`     | String  | No nulo, no vacío               |
| `precio`        | Double  | No nulo, positivo               |
| `disponibilidad`| Boolean | No nulo                        |

### Vuelo

Representa un vuelo disponible para reserva:

| Campo               | Tipo      | Restricciones                         |
|---------------------|-----------|-------------------------------------|
| `id`                | Long      | PK, auto generado                   |
| `compania`          | String    | No nulo, no vacío                   |
| `fecha`             | LocalDate | No nulo                            |
| `precio`            | Double    | No nulo, positivo                   |
| `plazasDisponibles`  | Integer   | No nulo, >= 0                      |
| `asientosDisponibles`| Integer   | No nulo, >= 0                      |
| `origen`            | String    | Puede ser null o vacío              |
| `destino`           | String    | Puede ser null o vacío              |

### Reserva

Entidad central que enlaza usuarios con hoteles y vuelos:

| Campo           | Tipo    | Restricciones                     |
|-----------------|---------|----------------------------------|
| `id`            | Long    | PK, auto generado               |
| `usuario`       | String  | No nulo, no vacío               |
| `dni`           | String  | No nulo, no vacío               |
| `numeroPersonas` | Integer | No nulo, positivo               |
| `vuelo`         | Vuelo   | Relación @ManyToOne (opcional)  |
| `hotel`         | Hotel   | Relación @ManyToOne (opcional)  |

---

## Flujo de Creación de una Reserva

1. Cliente envía un POST a `/reservas` con un JSON que contiene usuario, dni, número de personas, y opcionalmente IDs de vuelo y hotel.
2. El controlador `ReservaController` recibe el JSON, valida los datos con Jakarta Validation y mapea a `ReservaRequest`.
3. Se delega a `ReservaService`:
    - Se crea una nueva instancia de `Reserva`.
    - Si se especifica un `hotelId`, el servicio obtiene el hotel correspondiente con `HotelService`.
    - Si se especifica un `vueloId`, el servicio obtiene el vuelo correspondiente con `VueloService`.
    - Se establecen estas relaciones en la reserva.
    - Se guarda la reserva en la base de datos a través de `ReservaRepository`.
4. El controlador responde con la reserva creada y código HTTP 201 (Created).

---

## Validaciones importantes

- Uso de **Jakarta Validation** para asegurar que:
    - Campos obligatorios no estén vacíos (`@NotBlank`, `@NotNull`).
    - Valores numéricos sean positivos (`@Positive`, `@PositiveOrZero`).
- Validaciones automáticas al recibir datos JSON, lo que evita datos inválidos en la base.
- En caso de error, el cliente recibe un mensaje con el motivo.

---

## Endpoints detallados

### Hoteles

| Método | Ruta            | Funcionalidad                     | Entrada JSON           | Respuesta                 |
|--------|-----------------|---------------------------------|-----------------------|---------------------------|
| GET    | `/hoteles`      | Obtener listado de hoteles       | Ninguna               | Lista JSON de hoteles     |
| POST   | `/hoteles`      | Crear un hotel                   | JSON de hotel válido   | Hotel creado (201)        |
| GET    | `/hoteles/{id}` | Obtener hotel por ID             | Ninguna               | Hotel JSON                |
| DELETE | `/hoteles/{id}` | Eliminar hotel                  | Ninguna               | 204 No Content            |

### Vuelos

| Método | Ruta            | Funcionalidad                     | Entrada JSON           | Respuesta                 |
|--------|-----------------|---------------------------------|-----------------------|---------------------------|
| GET    | `/vuelos`       | Listar vuelos                   | Ninguna               | Lista JSON de vuelos      |
| POST   | `/vuelos`       | Crear un vuelo                  | JSON de vuelo válido   | Vuelo creado (201)        |
| GET    | `/vuelos/{id}`  | Obtener vuelo por ID            | Ninguna               | Vuelo JSON                |
| DELETE | `/vuelos/{id}`  | Eliminar vuelo                 | Ninguna               | 204 No Content            |

### Reservas

| Método | Ruta            | Funcionalidad                     | Entrada JSON           | Respuesta                 |
|--------|-----------------|---------------------------------|-----------------------|---------------------------|
| GET    | `/reservas`     | Listar todas las reservas        | Ninguna               | Lista JSON de reservas    |
| POST   | `/reservas`     | Crear una reserva               | JSON ReservaRequest válido | Reserva creada (201)      |

---
## Configuración

Tenemos que mirar si el microservicio está corriendo (en http://localhost:8080).

---

## Hoteles

### Crear un hotel (POST)
- Método: POST
- URL: http://localhost:8080/hoteles

{
"nombre": "Hotel Palma del Rio",
"categoria": "5 estrellas",
"precio": 110.0,
"disponibilidad": true,
"habitacionesDisponibles": 28
}

### Listar todos los hoteles (GET)
- Método: GET
- URL: http://localhost:8080/hoteles

### Obtener un hotel por ID (GET)
- Método: GET
- URL: http://localhost:8080/hoteles/1

### Eliminar un hotel por ID (DELETE)
- Método: DELETE
- URL: http://localhost:8080/hoteles/1

---

## Vuelos

### Crear un vuelo (POST)
- Método: POST
- URL: http://localhost:8080/vuelos

{
"compania": "Iberia",
"fecha": "2025-06-04",
"precio": 100.50,
"plazasDisponibles": 120,
"asientosDisponibles": 30,
"origen": "Sevilla"
"destino": "Santander",
}

### Listar todos los vuelos (GET)
- Método: GET
- URL: http://localhost:8080/vuelos

### Obtener un vuelo por ID (GET)
- Método: GET
- URL: http://localhost:8080/vuelos/1

### Eliminar un vuelo por ID (DELETE)
- Método: DELETE
- URL: http://localhost:8080/vuelos/1

---

## Reservas

### Crear una reserva (POST)
- Método: POST
- URL: http://localhost:8080/reservas

{
"usuario": "Javi Carrillo",
"dni": "17291444E",
"numeroPersonas": 3,
"vueloId": 1,
"hotelId": 1
}

---
## Manejo de Errores

- Si no se encuentra una entidad al buscar por ID (hotel, vuelo, reserva), se lanza una excepción `RuntimeException` con mensaje descriptivo. Esto debería manejarse con un controlador de excepciones global para devolver un código HTTP 404.
- Validaciones fallidas devuelven HTTP 400 con mensajes claros.

