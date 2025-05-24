package org.example.agenciadeviajes.Dto;

// Importamos las anotaciones para validaciones
import jakarta.validation.constraints.*;

public class ReservaRequest {
    // Campo para el nombre del usuario, no puede estar vacío
    @NotBlank(message = "El usuario es obligatorio")
    private String usuario;

    // Campo para el DNI del usuario, no puede estar vacío
    @NotBlank(message = "El DNI es obligatorio")
    private String dni;

    // Número de personas que hacen la reserva, no puede ser nulo y debe ser positivo (al menos 1)
    @NotNull(message = "El número de personas es obligatorio")
    @Positive(message = "El número de personas debe ser al menos 1")
    private Integer numeroPersonas;

    // Identificador opcional del vuelo asociado a la reserva
    private Long vueloId;

    // Identificador opcional del hotel asociado a la reserva
    private Long hotelId;

    // Constructor vacío necesario para que Spring pueda crear instancias
    public ReservaRequest() {}

    // Getter para usuario
    public String getUsuario() {
        return usuario;
    }

    // Setter para usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Getter para dni
    public String getDni() {
        return dni;
    }

    // Setter para dni
    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter para numeroPersonas
    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    // Setter para numeroPersonas
    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    // Getter para vueloId
    public Long getVueloId() {
        return vueloId;
    }

    // Setter para vueloId
    public void setVueloId(Long vueloId) {
        this.vueloId = vueloId;
    }

    // Getter para hotelId
    public Long getHotelId() {
        return hotelId;
    }

    // Setter para hotelId
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}
