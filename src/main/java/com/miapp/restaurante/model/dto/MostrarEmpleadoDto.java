package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarEmpleadoDto {
    private Long idEmpleado;
    private String nombreEmpleado;
    private String telefonoEmpleado;
    private String rolEmpleado;
    private Long salarioEmpleado;
}
