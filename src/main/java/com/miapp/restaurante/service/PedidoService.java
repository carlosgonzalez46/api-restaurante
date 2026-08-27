package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Pedido;
import com.miapp.restaurante.model.dto.ActualizarPedidoDto;
import com.miapp.restaurante.model.dto.CrearPedidoDto;
import com.miapp.restaurante.model.dto.MostrarPedidoDto;

import java.util.List;

public interface PedidoService {
    public Pedido crearPedido(CrearPedidoDto crearPedidoDto);
    public Pedido actualizarPedido(Long id, ActualizarPedidoDto actualizarPedidoDto);
    public void eliminarPedido(Long id);
    public MostrarPedidoDto obtenerPedidoPorId(Long id);
    public Pedido obtenerEntidadPedidoPorId(Long id);
    public List<MostrarPedidoDto> obtenerTodosLosPedidos();
}
