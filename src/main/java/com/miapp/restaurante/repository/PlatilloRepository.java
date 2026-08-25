package com.miapp.restaurante.repository;

import com.miapp.restaurante.model.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatilloRepository extends JpaRepository<Platillo, Long> {
}
