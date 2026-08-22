package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarClienteDto {
    private Long idCliente;
    private String nombreCliente;
    private String correoElectronico;
    private String direccion;
}
