package com.activity.E08Herencia.repos;

import com.activity.E08Herencia.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
