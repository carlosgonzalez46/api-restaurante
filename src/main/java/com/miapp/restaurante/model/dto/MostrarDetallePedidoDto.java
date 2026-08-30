package com.miapp.restaurante.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarDetallePedidoDto {
    private Long idDetallePedido;
    private int cantidad;
    private Long precioUnitario;
    private Long idPedido;
    private LocalDateTime fechaPedido;
    private Long idPlatillo;
    private String nombrePlatillo;

}
