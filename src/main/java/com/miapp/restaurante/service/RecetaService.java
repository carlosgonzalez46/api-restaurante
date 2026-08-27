package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Receta;
import com.miapp.restaurante.model.dto.ActualizarRecetaDto;
import com.miapp.restaurante.model.dto.CrearRecetaDto;
import com.miapp.restaurante.model.dto.MostrarRecetaDto;

import java.util.List;

public interface RecetaService {
    public Receta crearReceta(CrearRecetaDto crearRecetaDto);
    public Receta actualizarReceta(Long id, ActualizarRecetaDto actualizarRecetaDto);
    public void eliminarReceta(Long id);
    public MostrarRecetaDto obtenerRecetaPorId(Long id);
    public Receta obtenerEntidadRecetaPorId(Long id);
    public List<MostrarRecetaDto> obtenerTodasLasRecetas();
}
