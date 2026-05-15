package com.tienda.fitnessstore.model.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion;
    private String estado;
    private Date fechaEnvio;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Transportadora transportadora;
}