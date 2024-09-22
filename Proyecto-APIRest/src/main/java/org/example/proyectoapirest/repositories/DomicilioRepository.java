package org.example.proyectoapirest.repositories;

import org.example.proyectoapirest.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
