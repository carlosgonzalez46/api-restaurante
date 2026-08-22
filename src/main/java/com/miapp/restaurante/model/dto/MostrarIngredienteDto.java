package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarIngredienteDto {
    private Long idIngrediente;
    private String nombreIngrediente;
    private Integer stockActual;
    private Integer stockMinimo;
    private String unidadMedida;
}

