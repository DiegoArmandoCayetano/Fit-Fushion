package com.tienda.fitnessstore.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date fecha;
    private String estado;
    private double total;

    @ManyToOne
    private Cliente cliente;


    @OneToOne
    private Pago pago;

    @OneToOne
    private CarritoCompra carrito;
}