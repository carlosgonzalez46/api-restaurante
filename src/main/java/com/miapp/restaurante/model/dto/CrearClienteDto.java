package com.miapp.restaurante.model.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrearClienteDto {
    @NotBlank(message = "Campo nombre del cliente es obligatorio")
    @Size(max = 70, message = "Maximo de 70 caracteres permitido")
    private String nombreCliente;
    @Email
    private String correoElectronico;
    @NotBlank(message = "Campo direccion del cliente es obligatorio")
    @Size(max = 100, message = "Maximo de 100 caracteres permitido")
    private String direccion;
}
