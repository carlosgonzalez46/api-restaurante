package com.miapp.restaurante.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "platillo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Platillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_platillo")
    private Long idPlatillo;
    @Column(name = "nom_platillo", nullable = false)
    private String nombrePlatillo;
    @Column(name = "descripcion", nullable = true)
    private String descripcion;
    @Column(name = "precio", nullable = false)
    private Double precio;
}
