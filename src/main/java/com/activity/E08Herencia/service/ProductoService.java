package com.activity.E08Herencia.service;

import com.activity.E08Herencia.model.Producto;
import com.activity.E08Herencia.repos.ProductoRepository;
import com.activity.E08Herencia.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
