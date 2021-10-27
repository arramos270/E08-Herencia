package com.activity.E08Herencia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "empleado", fetch = FetchType.EAGER)
    private List<Corporativo> listaCCorporativosAAtender = new ArrayList<>();
}
