package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Platillo;
import com.miapp.restaurante.model.dto.ActualizarPlatilloDto;
import com.miapp.restaurante.model.dto.CrearPlatilloDto;
import com.miapp.restaurante.model.dto.MostrarPlatilloDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PlatilloMapper {
    public MostrarPlatilloDto toMostrarPlatillo(Platillo platillo);
    public Platillo crearPlatillo(CrearPlatilloDto crearPlatilloDto);
    public Platillo actualizarPlatillo(ActualizarPlatilloDto actualizarPlatilloDto, @MappingTarget Platillo platillo);
}
