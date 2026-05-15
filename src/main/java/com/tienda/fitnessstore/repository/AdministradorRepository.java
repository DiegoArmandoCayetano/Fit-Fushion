package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

}