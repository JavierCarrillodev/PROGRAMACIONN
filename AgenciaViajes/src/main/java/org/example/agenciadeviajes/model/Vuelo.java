package org.example.agenciadeviajes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

// Marca esta clase como una entidad JPA y la mapea a la tabla "vuelo"
@Entity
@Table(name = "vuelo")
public class Vuelo {
    // Identificador único de la entidad, clave primaria auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Compañía aérea, campo obligatorio y no vacío
    @NotBlank(message = "La compañía es obligatoria")
    private String compania;

    // Fecha del vuelo, campo obligatorio
    @NotNull(message = "La fecha es obligatoria")
    private LocalDate fecha;

    // Precio del vuelo, obligatorio y debe ser positivo
    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser positivo")
    private Double precio;

    // Número de plazas disponibles, obligatorio, no negativo
    @NotNull(message = "Las plazas disponibles son obligatorias")
    @PositiveOrZero(message = "Las plazas disponibles no pueden ser negativas")
    @Column(name = "plazas_disponibles")  // Mapea a la columna "plazas_disponibles" en la base de datos
    private Integer plazasDisponibles;

    // Número de asientos disponibles, obligatorio, no negativo
    @NotNull(message = "Los asientos disponibles son obligatorios")
    @PositiveOrZero(message = "Los asientos disponibles no pueden ser negativos")
    @Column(name = "asientos_disponibles") // Mapea a la columna "asientos_disponibles" en la base de datos
    private Integer asientosDisponibles;

    // Ciudad o aeropuerto de origen del vuelo (puede ser null o vacío)
    private String origen;

    // Ciudad o aeropuerto de destino del vuelo (puede ser null o vacío)
    private String destino;

    // Constructor vacío requerido por JPA
    public Vuelo() {}

    // Getters y setters para todos los campos

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompania() { return compania; }
    public void setCompania(String compania) { this.compania = compania; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getPlazasDisponibles() { return plazasDisponibles; }
    public void setPlazasDisponibles(Integer plazasDisponibles) { this.plazasDisponibles = plazasDisponibles; }

    public Integer getAsientosDisponibles() { return asientosDisponibles; }
    public void setAsientosDisponibles(Integer asientosDisponibles) { this.asientosDisponibles = asientosDisponibles; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
}
