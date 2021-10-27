package com.activity.E08Herencia.repos;

import com.activity.E08Herencia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c where TYPE(c) = Corporativo")
    public List<Cliente> clientesCorporativos();

    @Query("select c from Cliente c where TYPE(c) = Particular")
    public List<Cliente> clientesParticulares();

    //Y así amigos, es como nos ahorramos dos repositorios, pues no habrá
    //clientes que no sean ni Corporativos ni Particulares

}
