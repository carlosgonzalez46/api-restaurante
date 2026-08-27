package com.miapp.restaurante.service;

import com.miapp.restaurante.model.DetallePedido;
import com.miapp.restaurante.model.dto.ActualizarDetallePedidoDto;
import com.miapp.restaurante.model.dto.CrearDetallePedidoDto;
import com.miapp.restaurante.model.dto.MostrarDetallePedidoDto;

import java.util.List;

public interface DetallePedidoService {
    public DetallePedido crearDetallePedido(CrearDetallePedidoDto crearDetallePedidoDto);
    public DetallePedido actualizarDetallePedido(Long id, ActualizarDetallePedidoDto actualizarDetallePedidoDto);
    public void eliminarDetallePedido(Long id);
    public MostrarDetallePedidoDto obtenerDetallePedidoPorId(Long id);
    public DetallePedido obtenerEntidadDetallePedidoPorId(Long id);
    public List<MostrarDetallePedidoDto> obtenerTodosLosDetallesPedido();
}
