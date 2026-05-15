package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.Descuento;

public interface DescuentoRepository extends JpaRepository<Descuento, Long> {

}