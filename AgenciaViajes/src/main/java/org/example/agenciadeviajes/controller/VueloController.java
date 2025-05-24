package org.example.agenciadeviajes.controller;

import jakarta.validation.Valid;
import org.example.agenciadeviajes.model.Vuelo;
import org.example.agenciadeviajes.service.VueloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Definimos también esta clase como un controlador REST y asigna la ruta base "/vuelos"
@RestController
@RequestMapping("/vuelos")
public class VueloController {

    // Inyección del servicio que maneja la lógica relacionada con vuelos
    private final VueloService vueloService;

    // Constructor para inicializar el servicio mediante inyección de dependencias
    public VueloController(VueloService vueloService) {
        this.vueloService = vueloService;
    }

    // Manejamos peticiones GET para obtener la lista completa de vuelos
    @GetMapping
    public ResponseEntity<List<Vuelo>> listarVuelos() {
        // Retorna la lista de vuelos con un código HTTP 200 OK
        return ResponseEntity.ok(vueloService.listarVuelos());
    }

    // Maneja peticiones POST para crear un nuevo vuelo
    // Valida el objeto Vuelo recibido en el cuerpo de la petición
    @PostMapping
    public ResponseEntity<Vuelo> crearVuelo(@Valid @RequestBody Vuelo vuelo) {
        // Llama al servicio para crear el vuelo y retorna el vuelo creado con HTTP 201 Created
        Vuelo nuevoVuelo = vueloService.crearVuelo(vuelo);
        return new ResponseEntity<>(nuevoVuelo, HttpStatus.CREATED);
    }

    // Maneja peticiones GET para obtener un vuelo por su id específico
    @GetMapping("/{id}")
    public ResponseEntity<Vuelo> obtenerVueloPorId(@PathVariable Long id) {
        // Busca el vuelo por id y lo retorna con HTTP 200 OK
        Vuelo vuelo = vueloService.obtenerVueloPorId(id);
        return ResponseEntity.ok(vuelo);
    }

    // Maneja peticiones DELETE para eliminar un vuelo por su id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVuelo(@PathVariable Long id) {
        // Llama al servicio para eliminar el vuelo y retorna HTTP 204 No Content
        vueloService.eliminarVuelo(id);
        return ResponseEntity.noContent().build();
    }
}
