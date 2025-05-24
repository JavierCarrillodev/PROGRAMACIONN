package org.example.agenciadeviajes.repository;

import org.example.agenciadeviajes.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository para gestionar la entidad Hotel
// JpaRepository provee métodos CRUD y de paginación sin necesidad de implementarlos manualmente
public interface HotelRepository extends JpaRepository<Hotel, Long> {}
