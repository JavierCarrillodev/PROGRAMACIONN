package org.example.agenciadeviajes.controller;

import jakarta.validation.Valid;
import org.example.agenciadeviajes.Dto.ReservaRequest;
import org.example.agenciadeviajes.model.Reserva;
import org.example.agenciadeviajes.service.ReservaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Marca esta clase como un controlador REST y asigna la ruta base "/reservas"
@RestController
@RequestMapping("/reservas")
public class ReservaController {

    // Inyección del servicio para manejar la lógica de negocio relacionada con reservas
    private final ReservaService reservaService;

    // Constructor para inicializar el servicio mediante inyección de dependencias
    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    // Metodo para manejar peticiones POST y crear una nueva reserva
    // Se valida el cuerpo de la petición que debe ser un objeto ReservaRequest válido
    @PostMapping
    public ResponseEntity<Reserva> crearReserva(@Valid @RequestBody ReservaRequest reservaRequest) {
        // Se crea la reserva llamando al servicio y se retorna con código HTTP 201 (Created)
        Reserva nuevaReserva = reservaService.crearReserva(reservaRequest);
        return new ResponseEntity<>(nuevaReserva, HttpStatus.CREATED);
    }

    // Metodo para manejar peticiones GET y listar todas las reservas
    @GetMapping
    public ResponseEntity<List<Reserva>> listarReservas() {
        // Se obtienen todas las reservas desde el servicio
        List<Reserva> reservas = reservaService.obtenerTodasLasReservas();
        // Se retorna la lista con código HTTP 200 (OK)
        return ResponseEntity.ok(reservas);
    }
}
