package com.miapp.restaurante.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    private Long precio;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "platillo")
    private List<Receta> platilloRecetas = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "platillo_detalle")
    private List<DetallePedido> platilloDetalles = new ArrayList<>();
}
