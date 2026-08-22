package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarRecetaDto {
    private Long idReceta;
    private int cantidadRequerida;
    private Long idIngrediente;
    private Long idPlatillo;
    private String nombrePlatillo;
}
