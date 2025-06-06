DROP DATABASE IF EXISTS Agencia;
CREATE DATABASE Agencia;
USE Agencia;

CREATE TABLE hotel (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 nombre VARCHAR(255) NOT NULL,
 categoria VARCHAR(255) NOT NULL,
 precio DECIMAL(10, 2) NOT NULL,
 disponibilidad BOOLEAN NOT NULL
);
DROP TABLE IF EXISTS vuelo;
CREATE TABLE vuelo (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 compania VARCHAR(255) NOT NULL,
 fecha DATE NOT NULL,
 precio DECIMAL(10, 2) NOT NULL,
 plazas_disponibles INT NOT NULL,
asientos_disponibles INT NOT NULL,
origen VARCHAR(255),
destino VARCHAR(255)
);


CREATE TABLE reserva (
 id BIGINT PRIMARY KEY AUTO_INCREMENT,
 usuario VARCHAR(255) NOT NULL,
 dni VARCHAR(20) NOT NULL,
 vuelo_asociado BIGINT,
 hotel_asociado BIGINT,
 FOREIGN KEY (vuelo_asociado) REFERENCES vuelo(id),
 FOREIGN KEY (hotel_asociado) REFERENCES hotel(id)
);