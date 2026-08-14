package com.miapp.restaurante.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    @Column(name = "emp_nombre", nullable = false)
    private String nombreEmpleado;
    @Column(name = "emp_telefono")
    private String telefonoEmpleado;
    @Column(name = "emp_rol", nullable = false)
    private String rolEmpleado;
    @Column(name = "emp_estado")
    private String estadoEmpleado;

}
