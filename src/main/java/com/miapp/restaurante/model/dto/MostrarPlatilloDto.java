package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarPlatilloDto {
    private Long idPlatillo;
    private String nombrePlatillo;
    private String descripcion;
    private Long precio;
}
