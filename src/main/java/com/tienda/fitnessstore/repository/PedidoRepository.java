package com.tienda.fitnessstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.fitnessstore.model.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}