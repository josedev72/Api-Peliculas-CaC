package com.josedev72.ApiPeliculas.repository;

import com.josedev72.ApiPeliculas.model.Estrellas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstrellaRepository extends JpaRepository<Estrellas, Long> {

    Estrellas findByNombre(String nombre);
}
