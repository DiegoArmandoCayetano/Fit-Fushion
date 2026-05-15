package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}