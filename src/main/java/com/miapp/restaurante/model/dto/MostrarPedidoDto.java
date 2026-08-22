package com.miapp.restaurante.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MostrarPedidoDto {
    private Long idPedido;
    private LocalDateTime fechaPedido;
    private String estadoPedido;
    private Long totalPedido;
    private Long idEmpleado;
    private String nombreEmpleado;
    private Long idCliente;
    private String nombreCliente;
}
