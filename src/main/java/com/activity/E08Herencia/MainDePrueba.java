package com.activity.E08Herencia;

import com.activity.E08Herencia.model.*;
import com.activity.E08Herencia.service.ClienteService;
import com.activity.E08Herencia.service.EmpleadoService;
import com.activity.E08Herencia.service.PedidoService;
import com.activity.E08Herencia.service.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ClienteService clienteService;
    private final EmpleadoService empleadoService;
    private final PedidoService pedidoService;
    private final ProductoService productoService;

    @PostConstruct
    public void test(){

        Producto p1= Producto.builder().nombre("Patatas fritas").tipo("Comida").fechaCaducidad(LocalDate.of(2025, 1, 10)).build();
        Producto p2= Producto.builder().nombre("Kétchup").tipo("Bebida").fechaCaducidad(LocalDate.of(2022, 10, 7)).build();
        Producto p3= Producto.builder().nombre("Jamón York").tipo("Comida").fechaCaducidad(LocalDate.of(2020, 12, 5)).build();
        productoService.save(p1); productoService.save(p2); productoService.save(p3);

        List<Producto> listaProductos1 = List.of(p1, p2);

        List<Producto> listaProductos2 = List.of(p3);


        Pedido pedido1= Pedido.builder()
                .fechaPedido(LocalDateTime.now())
                .listaProductos(listaProductos1)
                .build();
        pedidoService.save(pedido1);

        Pedido pedido2=Pedido.builder()
                .fechaPedido(LocalDateTime.of(2021, 9, 19, 18, 37))
                .listaProductos(listaProductos2)
                .build();
        pedidoService.save(pedido2);

        List<Pedido> listaPedido1 = List.of(pedido1);

        List<Pedido> listaPedido2 = List.of(pedido2);

        Cliente cliente1= Corporativo.builder()
                .nombre("Jose Luis Guerra")
                .fechaRegistro(LocalDate.of(2019, 12, 7))
                .listaPedidos(listaPedido1)
                .empresa("VisionLabs")
                .numCuentaBancoEmpresa(2817482812L)
                .build();
        clienteService.save(cliente1);

        Cliente cliente2= Particular.builder()
                .nombre("Marina Sánchez Pérez")
                .fechaRegistro(LocalDate.of(2019, 12, 7))
                .listaPedidos(null)
                .numCuentaBancoParticular(17283646224L)
                .build();
        clienteService.save(cliente2);

        Cliente cliente3= Particular.builder()
                .nombre("Pepe Luis Rodríguez")
                .fechaRegistro(LocalDate.now())
                .listaPedidos(listaPedido2)
                .numCuentaBancoParticular(1827463919L)
                .build();
        clienteService.save(cliente3);
    }

}
