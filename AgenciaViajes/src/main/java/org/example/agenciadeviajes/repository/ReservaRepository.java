package org.example.agenciadeviajes.repository;

import org.example.agenciadeviajes.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository para gestionar la entidad Reserva
// JpaRepository proporciona operaciones CRUD y otras funcionalidades para la entidad Reserva
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
