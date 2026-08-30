package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.Ingrediente;
import com.miapp.restaurante.model.Platillo;
import com.miapp.restaurante.model.Receta;
import com.miapp.restaurante.model.dto.ActualizarRecetaDto;
import com.miapp.restaurante.model.dto.CrearRecetaDto;
import com.miapp.restaurante.model.dto.MostrarRecetaDto;
import org.springframework.stereotype.Component;

@Component
public class RecetaMapper {
    public MostrarRecetaDto toMostrarReceta(Receta receta){
        MostrarRecetaDto mostrarRecetaDto = new MostrarRecetaDto();
        mostrarRecetaDto.setIdReceta(receta.getIdReceta());
        mostrarRecetaDto.setCantidadRequerida(receta.getCantidadRequerida());
        mostrarRecetaDto.setIdIngrediente(receta.getIngrediente().getIdIngrediente());
        mostrarRecetaDto.setIdPlatillo(receta.getPlatillo().getIdPlatillo());
        mostrarRecetaDto.setNombrePlatillo(receta.getPlatillo().getNombrePlatillo());
        return mostrarRecetaDto;
    }
    public Receta crearReceta(CrearRecetaDto crearRecetaDto){
        Receta receta = new Receta();
        Ingrediente ingrediente = new Ingrediente();
        Platillo platillo = new Platillo();
        receta.setCantidadRequerida(crearRecetaDto.getCantidadRequerida());
        ingrediente.setIdIngrediente(crearRecetaDto.getIdIngrediente());
        platillo.setIdPlatillo(crearRecetaDto.getIdPlatillo());
        receta.setIngrediente(ingrediente);
        receta.setPlatillo(platillo);
        return receta;
    }
    public Receta actualizarReceta(ActualizarRecetaDto actualizarRecetaDto, Receta receta){
        Ingrediente ingrediente = new Ingrediente();
        Platillo platillo = new Platillo();
        receta.setCantidadRequerida(actualizarRecetaDto.getCantidadRequerida());
        ingrediente.setIdIngrediente(actualizarRecetaDto.getIdIngrediente());
        platillo.setIdPlatillo(actualizarRecetaDto.getIdPlatillo());
        receta.setIngrediente(ingrediente);
        receta.setPlatillo(platillo);
        return receta;
    }


}
