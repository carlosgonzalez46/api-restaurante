package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarDetallePedidoDto {
    private Long idDetallePedido;
    private int cantidad;
    private Long precioUnitario;
    private Long idPedido;
    private Long idPlatillo;
}
