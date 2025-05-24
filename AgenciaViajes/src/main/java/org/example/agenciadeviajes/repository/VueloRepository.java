package org.example.agenciadeviajes.repository;

import org.example.agenciadeviajes.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

// Interfaz que extiende JpaRepository para gestionar la entidad Vuelo
// JpaRepository proporciona métodos CRUD y consultas comunes para la entidad Vuelo
public interface VueloRepository extends JpaRepository<Vuelo, Long> {}
