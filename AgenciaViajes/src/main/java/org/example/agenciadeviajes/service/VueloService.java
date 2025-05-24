package org.example.agenciadeviajes.service;

import org.example.agenciadeviajes.model.Vuelo;
import org.example.agenciadeviajes.repository.VueloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Marca esta clase como un servicio de Spring
public class VueloService {
    private final VueloRepository vueloRepository; // Repositorio para acceder a la base de datos de vuelos

    // Constructor para inyección de dependencias del repositorio
    public VueloService(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    // Metodo para obtener todos los vuelos almacenados
    public List<Vuelo> listarVuelos() {
        return vueloRepository.findAll();
    }

    // Metodo para crear un nuevo vuelo y guardarlo en la base de datos
    public Vuelo crearVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    // Metodo para obtener un vuelo por su id
    public Vuelo obtenerVueloPorId(Long id) {
        Optional<Vuelo> vuelo = vueloRepository.findById(id);
        // Si existe el vuelo, se devuelve, sino devuelve null
        return vuelo.orElse(null);
    }

    // Metodo para eliminar un vuelo por su id
    public void eliminarVuelo(Long id) {
        vueloRepository.deleteById(id);
    }
}
