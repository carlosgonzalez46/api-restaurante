package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearDetallePedido {
    @Positive(message = "La cantidad debe ser mayor a cero")
    @NotNull(message = "El campo cantidad es obligatorio")
    private int cantidad;
    @Positive(message = "El precio unitario debe ser mayor a cero")
    @NotNull(message = "El campo precio unitario es obligatorio")
    private Long precioUnitario;
    @Positive
    @NotNull(message = "El campo id de pedido es obligatorio")
    private Long idPedido;
    @Positive
    @NotNull(message = "El campo id de platillo es obligatorio")
    private Long idPlatillo;
}
