package com.miapp.restaurante.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingrediente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingrediente")
    private Long idIngrediente;
    @Column(name = "nom_ingrediente", nullable = false)
    private String nombreIngrediente;
    @Column(name = "stock_actual", nullable = false)
    private int stockActual;
    @Column(name = "stock_minimo", nullable = false)
    private int stockMinimo;
    @Column(name = "unidad_medida", nullable = false)
    private String unidadMedida;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ingrediente")
    private List<Receta> ingredienteRecetas = new ArrayList<>();
}
