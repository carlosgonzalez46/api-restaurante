package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearEmpleadoDto {
    @NotBlank(message = "Campo nombre de empleado es obligatorio")
    @Size(max = 70, message = "Maximo de 70 caracteres permitido")
    private String nombreEmpleado;
    @NotBlank(message = "Campo telefono de empleado es obligatorio")
    private String telefonoEmpleado;
    @NotBlank(message = "Campo rol del empleado es obligatorio")
    @Size(max = 30, message = "Maximo de 30 caracteres permitido")
    private String rolEmpleado;
    @PositiveOrZero(message = "El salario debe ser cero o mayor a cero")
    @NotNull(message = "Campo salario de empleado es obligatorio")
    private Long salarioEmpleado;
}
