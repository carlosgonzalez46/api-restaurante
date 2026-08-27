package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Empleado;
import com.miapp.restaurante.model.dto.ActualizarEmpleadoDto;
import com.miapp.restaurante.model.dto.CrearEmpleadoDto;
import com.miapp.restaurante.model.dto.MostrarEmpleadoDto;

import java.util.List;

public interface EmpleadoService {
    public Empleado crearEmpleado(CrearEmpleadoDto crearEmpleadoDto);
    public Empleado actualizarEmpleado(Long id, ActualizarEmpleadoDto actualizarEmpleadoDto);
    public void eliminarEmpleado(Long id);
    public MostrarEmpleadoDto obtenerEmpleadoPorId(Long id);
    public Empleado obtenerEntidadEmpladoPorId(Long id);
    public List<MostrarEmpleadoDto> obtenerTodosLosEmpleados();
}
