package org.example.agenciadeviajes.service;

import org.example.agenciadeviajes.model.Hotel;
import org.example.agenciadeviajes.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marca esta clase como un servicio de Spring, para ser gestionada por el contenedor
public class HotelService {

    private final HotelRepository hotelRepository; // Repositorio para acceder a los datos de hoteles

    // Constructor para inyectar la dependencia del repositorio
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    // Metodo que devuelve una lista con todos los hoteles almacenados en la base de datos
    public List<Hotel> listarHoteles() {
        return hotelRepository.findAll();
    }

    // Metodo que guarda un nuevo hotel o actualiza uno existente y devuelve el hotel guardado
    public Hotel crearHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    // Metodo que busca un hotel por su ID, lanza excepción si no existe
    public Hotel obtenerHotelPorId(Long id) {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel no encontrado con ID: " + id));
    }

    // Metodo para eliminar un hotel por su ID, lanza excepción si no existe
    public void eliminarHotel(Long id) {
        if (!hotelRepository.existsById(id)) {
            throw new RuntimeException("Hotel no encontrado con ID: " + id);
        }
        hotelRepository.deleteById(id);
    }
}
