package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Cliente;
import com.miapp.restaurante.model.Empleado;
import com.miapp.restaurante.model.Pedido;
import com.miapp.restaurante.model.dto.ActualizarPedidoDto;
import com.miapp.restaurante.model.dto.CrearPedidoDto;
import com.miapp.restaurante.model.dto.MostrarPedidoDto;
import org.springframework.stereotype.Component;

@Component
public class PedidoMapper {
    public MostrarPedidoDto toMostrarPedido(Pedido pedido){
        MostrarPedidoDto mostrarPedidoDto = new MostrarPedidoDto();
        mostrarPedidoDto.setIdPedido(pedido.getIdPedido());
        mostrarPedidoDto.setFechaPedido(pedido.getFechaPedido());
        mostrarPedidoDto.setEstadoPedido(pedido.getEstadoPedido());
        mostrarPedidoDto.setTotalPedido(pedido.getTotalPedido());
        mostrarPedidoDto.setIdEmpleado(pedido.getEmpleado().getIdEmpleado());
        mostrarPedidoDto.setNombreCliente(pedido.getCliente().getNombreCliente());
        mostrarPedidoDto.setIdCliente(pedido.getCliente().getIdCliente());
        mostrarPedidoDto.setNombreCliente(pedido.getCliente().getNombreCliente());
        return mostrarPedidoDto;
    }
    public Pedido crearPedido(CrearPedidoDto crearPedidoDto){
        Pedido pedido = new Pedido();
        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();
        pedido.setFechaPedido(crearPedidoDto.getFechaPedido());
        pedido.setEstadoPedido(crearPedidoDto.getEstadoPedido());
        pedido.setTotalPedido(crearPedidoDto.getTotalPedido());
        empleado.setIdEmpleado(crearPedidoDto.getIdEmpleado());
        cliente.setIdCliente(crearPedidoDto.getIdCliente());
        pedido.setCliente(cliente);
        pedido.setEmpleado(empleado);
        return pedido;
    }
    public Pedido actualizarPedido(ActualizarPedidoDto actualizarPedidoDto, Pedido pedido){
        Empleado empleado = new Empleado();
        Cliente cliente = new Cliente();
        pedido.setFechaPedido(actualizarPedidoDto.getFechaPedido());
        pedido.setEstadoPedido(actualizarPedidoDto.getEstadoPedido());
        pedido.setTotalPedido(actualizarPedidoDto.getTotalPedido());
        empleado.setIdEmpleado(actualizarPedidoDto.getIdEmpleado());
        cliente.setIdCliente(actualizarPedidoDto.getIdCliente());
        pedido.setEmpleado(empleado);
        pedido.setCliente(cliente);
        return pedido;
    }

}
