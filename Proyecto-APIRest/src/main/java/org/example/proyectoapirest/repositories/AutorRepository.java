package org.example.proyectoapirest.repositories;

import org.example.proyectoapirest.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
