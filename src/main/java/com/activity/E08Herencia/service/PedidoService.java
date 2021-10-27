package com.activity.E08Herencia.service;

import com.activity.E08Herencia.model.Pedido;
import com.activity.E08Herencia.repos.PedidoRepository;
import com.activity.E08Herencia.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends BaseService<Pedido, Long, PedidoRepository> {
}
