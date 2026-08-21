package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearPedidoDto {
    @Future
    @NotNull(message = "El campo fecha de pedido es obligatorio")
    private LocalDateTime fechaPedido;
    @NotBlank(message = "El campo estado de pedido es obligatorio")
    @Size(max = 50, message = "Maximo de 50 caracteres permitido")
    private String estadoPedido;
    @NotNull(message = "El campo total de pedido es obligatorio")
    @Positive(message = "El total de pedido debe ser un numero mayor a cero")
    private Long totalPedido;
    @Positive
    @NotNull(message = "El campo id de empleado es obligatorio")
    private Long idEmpleado;
    @Positive
    @NotNull(message = "El campo id de cliente es obligatorio")
    private Long idCliente;
}
