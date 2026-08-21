package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearIngredienteDto {
    @NotBlank(message = "Campo nombre de ingrediente es obligatorio")
    @Size(max = 70, message = "Maximo de 70 caracteres permitido")
    private String nombreIngrediente;
    @PositiveOrZero(message = "El stock actual debe ser cero o mayor a cero")
    @NotNull(message = "Campo stock actual es obligatorio")
    private Integer stockActual;
    @Positive(message = "El stock mínimo debe ser un numero positivo mayor a cero")
    @NotNull(message = "Campo stock mínimo es obligatorio")
    private Integer stockMinimo;
    @NotBlank(message = "Campo unidad de medida es obligatorio")
    @Size(max = 30, message = "Maximo de 30 caracteres permitido")
    private String unidadMedida;
}
