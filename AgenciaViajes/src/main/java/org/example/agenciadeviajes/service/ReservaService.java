package org.example.agenciadeviajes.service;

import org.example.agenciadeviajes.Dto.ReservaRequest;
import org.example.agenciadeviajes.model.Hotel;
import org.example.agenciadeviajes.model.Reserva;
import org.example.agenciadeviajes.model.Vuelo;
import org.example.agenciadeviajes.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio gestionado por Spring
public class ReservaService {
    private final ReservaRepository reservaRepository; // Repositorio para operaciones con reservas
    private final HotelService hotelService;           // Servicio para manejar hoteles
    private final VueloService vueloService;           // Servicio para manejar vuelos

    // Constructor para inyectar las dependencias necesarias
    public ReservaService(
            ReservaRepository reservaRepository,
            HotelService hotelService,
            VueloService vueloService
    ) {
        this.reservaRepository = reservaRepository;
        this.hotelService = hotelService;
        this.vueloService = vueloService;
    }

    // Metodo para crear una nueva reserva a partir de una solicitud (DTO)
    public Reserva crearReserva(ReservaRequest reservaRequest) {
        Reserva reserva = new Reserva();  // Se crea una nueva instancia de Reserva
        reserva.setUsuario(reservaRequest.getUsuario());           // Se asigna el usuario
        reserva.setDni(reservaRequest.getDni());                   // Se asigna el DNI
        reserva.setNumeroPersonas(reservaRequest.getNumeroPersonas()); // Se asigna el número de personas

        // Si se especifica un hotel, se busca y se asocia a la reserva
        if (reservaRequest.getHotelId() != null) {
            Hotel hotel = hotelService.obtenerHotelPorId(reservaRequest.getHotelId());
            reserva.setHotel(hotel);
        }

        // Si se especifica un vuelo, se busca y se asocia a la reserva
        if (reservaRequest.getVueloId() != null) {
            Vuelo vuelo = vueloService.obtenerVueloPorId(reservaRequest.getVueloId());
            reserva.setVuelo(vuelo);
        }

        // Se guarda la reserva en la base de datos y se devuelve la entidad guardada
        return reservaRepository.save(reserva);
    }

    // Metodo para obtener todas las reservas almacenadas en la base de datos
    public List<Reserva> obtenerTodasLasReservas() {
        return reservaRepository.findAll();
    }
}
