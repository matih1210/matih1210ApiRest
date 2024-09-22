package org.example.proyectoapirest.repositories;

import org.example.proyectoapirest.entities.Localidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LocalidadRepository extends JpaRepository<Localidad, Long> {
}
