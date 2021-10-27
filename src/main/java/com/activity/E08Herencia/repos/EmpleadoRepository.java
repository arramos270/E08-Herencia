package com.activity.E08Herencia.repos;

import com.activity.E08Herencia.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
