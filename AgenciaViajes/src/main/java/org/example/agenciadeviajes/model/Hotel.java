package org.example.agenciadeviajes.model;

// Importamos anotaciones JPA y validación
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

// Indicamos que esta clase es una entidad JPA y se mapea a la tabla "hotel"
@Entity
@Table(name = "hotel")
public class Hotel {
    // Clave primaria auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del hotel, campo obligatorio no vacío
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    // Categoría del hotel, también obligatorio no vacío
    @NotBlank(message = "La categoría es obligatoria")
    private String categoria;

    // Precio del hotel, obligatorio y debe ser un valor positivo
    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser positivo")
    private Double precio;

    // Indica si el hotel está disponible o no, campo obligatorio
    @NotNull(message = "La disponibilidad es obligatoria")
    private Boolean disponibilidad;

    // Constructor vacío requerido por JPA
    public Hotel() {}

    // Constructor con todos los campos excepto id
    public Hotel(String nombre, String categoria, Double precio, Boolean disponibilidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    // Getters y setters para todos los campos

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
