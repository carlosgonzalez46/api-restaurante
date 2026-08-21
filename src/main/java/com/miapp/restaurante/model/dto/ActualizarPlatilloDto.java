package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualizarPlatilloDto {
    @NotBlank(message = "Campo nombre de platillo es obligatorio")
    @Size(max = 100, message = "Maximo de 100 caracteres permitidos")
    private String nombrePlatillo;
    @Size(max = 255, message = "Maximo de 255 caracteres permitidos")
    private String descripcion;
    @Positive(message = "El precio debe ser un numero positivo")
    @NotNull(message = "Campo precio de platillo es obligatorio")
    private Long precio;
}
