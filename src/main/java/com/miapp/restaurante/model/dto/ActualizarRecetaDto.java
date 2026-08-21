package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualizarRecetaDto {
    @Positive(message = "La cantidad requerida debe ser mayor a cero")
    @NotNull(message = "Campo cantidad requerida es obligatorio")
    private int cantidadRequerida;
    @Positive
    @NotNull(message = "El id del ingrediente es obligatorio")
    private Long idIngrediente;
    @Positive
    @NotNull(message = "El id del platillo es obligatorio")
    private Long idPlatillo;
}
