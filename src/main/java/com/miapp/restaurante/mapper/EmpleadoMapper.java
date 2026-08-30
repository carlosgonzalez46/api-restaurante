package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Empleado;
import com.miapp.restaurante.model.dto.ActualizarEmpleadoDto;
import com.miapp.restaurante.model.dto.CrearEmpleadoDto;
import com.miapp.restaurante.model.dto.MostrarEmpleadoDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmpleadoMapper {
    public MostrarEmpleadoDto toMostrarEmpleado(Empleado empleado);
    public Empleado crearEmpleado(CrearEmpleadoDto crearEmpleadoDto);
    public Empleado actualizarEmpleado(ActualizarEmpleadoDto actualizarEmpleadoDto, @MappingTarget Empleado empleado);
}
