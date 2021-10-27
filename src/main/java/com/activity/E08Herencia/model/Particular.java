package com.activity.E08Herencia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;

@Entity
@SuperBuilder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Particular extends Cliente{

    //Pese a que varias personas pueden compartir cuenta, tomaremos
    // como que cada persona tiene una propia a la que llegarán los cargos
    private Long numCuentaBancoParticular;
}
