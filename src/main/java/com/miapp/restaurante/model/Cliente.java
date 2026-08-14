package com.miapp.restaurante.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = true)
    private Long idCliente;
    @Column(name = "cli_nombre", nullable = false)
    private String nombreCliente;
    @Column(name = "correo_electronico", nullable = true)
    private String correoElectronico;
    @Column(name = "cli_direccion", nullable = false)
    private String direccion;
}
