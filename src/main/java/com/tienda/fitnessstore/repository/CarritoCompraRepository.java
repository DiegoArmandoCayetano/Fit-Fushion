package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.CarritoCompra;

public interface CarritoCompraRepository extends JpaRepository<CarritoCompra, Long> {

}