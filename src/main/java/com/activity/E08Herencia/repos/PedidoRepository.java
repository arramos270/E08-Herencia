package com.activity.E08Herencia.repos;

import com.activity.E08Herencia.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
