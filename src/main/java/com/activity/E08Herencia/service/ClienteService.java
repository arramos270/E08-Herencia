package com.activity.E08Herencia.service;

import com.activity.E08Herencia.model.Cliente;
import com.activity.E08Herencia.repos.ClienteRepository;
import com.activity.E08Herencia.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente, Long, ClienteRepository> {
}
