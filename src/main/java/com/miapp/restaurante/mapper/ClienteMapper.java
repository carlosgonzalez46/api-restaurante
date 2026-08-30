package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Cliente;
import com.miapp.restaurante.model.dto.ActualizarClienteDto;
import com.miapp.restaurante.model.dto.CrearClienteDto;
import com.miapp.restaurante.model.dto.MostrarClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    public MostrarClienteDto toMostrarCliente(Cliente cliente);
    public Cliente crearCliente(CrearClienteDto crearClienteDto);
    public Cliente actualizarCliente(ActualizarClienteDto actualizarClienteDto, @MappingTarget Cliente cliente);
}
