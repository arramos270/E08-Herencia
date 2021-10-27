package com.activity.E08Herencia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter @Setter
@MappedSuperclass
@NoArgsConstructor @AllArgsConstructor
public abstract class Cliente {

    @Id
    @GeneratedValue //No podremos usarlo como un id de producto, pero ambas tendrán un atributo id
    private Long id;

    private String nombre;
    private LocalDate fechaRegistro;

    /* Relación unidireccional y fetch de tipo Lazy:
        Establecemos una relación OneToMany unidireccional y con fetch de tipo Lazy
        porque puede que no nos interese ver todos los pedidos de un cliente
        cuando sólo queremos comprobar su fecha de registro
     */
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Pedido> listaPedidos = new ArrayList<>();
}
