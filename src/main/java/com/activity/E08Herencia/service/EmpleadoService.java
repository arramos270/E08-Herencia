package com.activity.E08Herencia.service;

import com.activity.E08Herencia.model.Empleado;
import com.activity.E08Herencia.repos.EmpleadoRepository;
import com.activity.E08Herencia.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService extends BaseService<Empleado, Long, EmpleadoRepository> {
}
