package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Cliente;
import com.miapp.restaurante.model.dto.ActualizarClienteDto;
import com.miapp.restaurante.model.dto.CrearClienteDto;
import com.miapp.restaurante.model.dto.MostrarClienteDto;

import java.util.List;

public interface ClienteService {
    public Cliente crearCliente(CrearClienteDto crearClienteDto);
    public Cliente actualizarCliente(Long id, ActualizarClienteDto actualizarClienteDto);
    public void eliminarCliente(Long id);
    public MostrarClienteDto obtenerClientePorId(Long id);
    public Cliente obtenerEntidadClientePorId(Long id);
    public List<MostrarClienteDto> obtenerTodosLosClientes();
}
