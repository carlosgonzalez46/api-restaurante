package com.miapp.restaurante.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "receta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta")
    private Long idReceta;
    @Column(name = "cantidad_requerida", nullable = false)
    private int cantidadRequerida;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ingrediente")
    private Ingrediente ingrediente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_platillo")
    private Platillo platillo;
}
