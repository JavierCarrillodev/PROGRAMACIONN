package org.example.agenciadeviajes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

// Indica que esta clase es una entidad JPA y se mapea a la tabla "reserva"
@Entity
@Table(name = "reserva")
public class Reserva {
    // Clave primaria auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Usuario que hace la reserva, campo obligatorio no vacío
    @NotBlank(message = "El usuario es obligatorio")
    private String usuario;

    // DNI del usuario, campo obligatorio no vacío
    @NotBlank(message = "El DNI es obligatorio")
    private String dni;

    // Número de personas para la reserva, obligatorio y debe ser positivo
    @NotNull(message = "El número de personas es obligatorio")
    @Positive(message = "El número de personas debe ser al menos 1")
    @Column(name = "numero_personas") // Especifica el nombre de la columna en la base de datos
    private Integer numeroPersonas;

    // Relación ManyToOne con la entidad Vuelo, carga eager (se carga junto con la reserva)
    @ManyToOne(fetch = FetchType.EAGER) /* Esto sirve para definir la estrategia de carga de la relación entre entidades en JPA/Hibernate. */
    @JoinColumn(name = "vuelo_asociado") // Nombre de la columna que representa esta relación en la tabla reserva
    private Vuelo vuelo;

    // Relación ManyToOne con la entidad Hotel, también con carga eager
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_asociado") // Nombre de la columna que representa esta relación en la tabla reserva
    private Hotel hotel;

    // Constructor vacío requerido por JPA
    public Reserva() {}

    // Getters y setters para todos los campos

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }
    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
