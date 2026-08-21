package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearRecetaDto {
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
