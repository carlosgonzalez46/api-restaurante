package com.miapp.restaurante.service;

import com.miapp.restaurante.model.Platillo;
import com.miapp.restaurante.model.dto.ActualizarPlatilloDto;
import com.miapp.restaurante.model.dto.CrearPlatilloDto;
import com.miapp.restaurante.model.dto.MostrarPlatilloDto;

import java.util.List;

public interface PlatilloService {
    public Platillo crearPlatillo(CrearPlatilloDto crearPlatilloDto);
    public Platillo actualizarPlatillo(Long id, ActualizarPlatilloDto actualizarPlatilloDto);
    public void eliminarPlatillo(Long id);
    public MostrarPlatilloDto obtenerPlatilloPorId(Long id);
    public Platillo obtenerEntidadPlatilloPorId(Long id);
    public List<MostrarPlatilloDto> obtenerTodosLosPlatillos();
}
