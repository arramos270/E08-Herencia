package com.activity.E08Herencia.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, tipo;

    private LocalDate fechaCaducidad;

    @ManyToOne
    @JoinColumn(name = "pedido_id", foreignKey = @ForeignKey(name = "FK_PRODUCTO_PEDIDO"))
    private Pedido pedido;
}
