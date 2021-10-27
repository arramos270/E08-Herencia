package com.activity.E08Herencia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@SuperBuilder
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Corporativo extends Cliente{

    private String empresa;

    //Tomamos que cuando un cliente corporativo compra algo,
    //aquello que compre se cargará a la cuenta de la empresa
    private Long numCuentaBancoEmpresa;

    /*Bidireccional:
        Pues cuando busquemos un cliente corporativo, podría estar
        bien traernos al empleado que lo trata, así como al buscar un
        empleado, ver los clientes corporativos a los que representa.

        (Así, partimos de que esta relación es como la que un "coach"
        de gimnasio tiene con los clientes del gimnasio a los que entrena,
        o cuando un camarero se encarga de asistir a las personas que
        se sientan en unas mesas concretas)
     */
    @ManyToOne
    private Empleado empleado;

}
