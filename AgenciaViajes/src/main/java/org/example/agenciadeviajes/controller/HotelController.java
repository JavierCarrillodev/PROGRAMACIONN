package org.example.agenciadeviajes.controller;

import jakarta.validation.Valid;
import org.example.agenciadeviajes.model.Hotel;
import org.example.agenciadeviajes.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indica que esta clase es un controlador REST, que responde a solicitudes HTTP
@RestController
// Define la ruta base para todos los endpoints en este controlador
@RequestMapping("/hoteles")
public class HotelController {

    // Este servicio lo que hace es manejar la lógica de negocio relacionada con hoteles
    private final HotelService hotelService;

    // Constructor que inyecta el servicio HotelService (inyección de dependencias)
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    // Creamos un metodo que maneja solicitudes GET para listar todos los hoteles
    @GetMapping
    public ResponseEntity<List<Hotel>> listarHoteles() {
        // Devuelve la lista de hoteles obtenida del servicio con código 200 OK
        return ResponseEntity.ok(hotelService.listarHoteles());
    }

    // Metodo que maneja solicitudes POST para crear un nuevo hotel
    // Validamos que el objeto Hotel recibido en el cuerpo de la petición sea correcto
    @PostMapping
    public ResponseEntity<Hotel> crearHotel(@Valid @RequestBody Hotel hotel) {
        // Crea el hotel usando el servicio y devuelve el objeto creado con código 201 CREATED
        Hotel nuevoHotel = hotelService.crearHotel(hotel);
        return new ResponseEntity<>(nuevoHotel, HttpStatus.CREATED);
    }

    // Metodo que maneja solicitudes GET para obtener un hotel por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Hotel> obtenerHotelPorId(@PathVariable Long id) {
        // Obtiene el hotel usando el servicio y devuelve con código 200 OK
        Hotel hotel = hotelService.obtenerHotelPorId(id);
        return ResponseEntity.ok(hotel);
    }

    // Metodo que maneja solicitudes DELETE para eliminar un hotel por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHotel(@PathVariable Long id) {
        // Llamamos al servicio para eliminar el hotel y responde con código 204 No Content
        hotelService.eliminarHotel(id);
        return ResponseEntity.noContent().build();
    }
}
