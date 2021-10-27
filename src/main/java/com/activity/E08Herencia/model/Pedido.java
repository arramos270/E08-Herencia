package com.activity.E08Herencia.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Pedido implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime fechaPedido;

    /* Creación de la entidad "producto" y fetch tipo EAGER:
        Pese a que un pedido debería estar formado por una linea de pedidos,
        he creado una clase producto para poder cambiar todo eso por un atributo
        que recoja una lista de productos.

        El tipo de fetching viene dado porque cada vez que queramos
        pedir un pedido, querremos traernos TODOS los productos de la lista,
        por lo que también estableceremos una relación bidireccional.
     */
    @OneToMany(mappedBy = "Pedido", fetch = FetchType.EAGER)
    private List<Producto>  listaProductos= new ArrayList<>();
}
