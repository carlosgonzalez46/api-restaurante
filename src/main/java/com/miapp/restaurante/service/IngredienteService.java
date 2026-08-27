package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Ingrediente;
import com.miapp.restaurante.model.dto.ActualizarIngredienteDto;
import com.miapp.restaurante.model.dto.CrearIngredienteDto;
import com.miapp.restaurante.model.dto.MostrarIngredienteDto;

import java.util.List;

public interface IngredienteService {
    public Ingrediente crearIngrediente(CrearIngredienteDto crearIngredienteDto);
    public Ingrediente actualizarIngrediente(Long id, ActualizarIngredienteDto actualizarIngredienteDto);
    public void eliminarIngrediente(Long id);
    public MostrarIngredienteDto obtenerIngredientePorId(Long id);
    public Ingrediente obtenerEntidadIngredientePorId(Long id);
    public List<MostrarIngredienteDto> obtenerTodosLosIngredientes();
}
