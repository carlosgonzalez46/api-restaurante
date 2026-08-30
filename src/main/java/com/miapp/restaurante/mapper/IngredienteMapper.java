package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Ingrediente;
import com.miapp.restaurante.model.dto.ActualizarIngredienteDto;
import com.miapp.restaurante.model.dto.CrearIngredienteDto;
import com.miapp.restaurante.model.dto.MostrarIngredienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface IngredienteMapper {
    public MostrarIngredienteDto toMostraringrediente(Ingrediente ingrediente);
    public Ingrediente crearIngrediente(CrearIngredienteDto crearIngredienteDto);
    public Ingrediente actualizarIngrediente(ActualizarIngredienteDto actualizarIngredienteDto, @MappingTarget Ingrediente ingrediente);
}
