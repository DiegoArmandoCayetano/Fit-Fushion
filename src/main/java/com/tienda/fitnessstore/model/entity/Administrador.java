
package com.tienda.fitnessstore.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Administrador extends Usuario {

    private String permisos;
}

