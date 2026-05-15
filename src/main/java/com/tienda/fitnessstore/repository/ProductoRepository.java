package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}