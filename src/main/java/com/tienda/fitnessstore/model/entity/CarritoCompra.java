package com.tienda.fitnessstore.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class CarritoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean activo;

    @ManyToOne
    private Cliente cliente;

    @OneToMany
    private List<ItemCarrito> items;
}