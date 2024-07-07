package com.josedev72.ApiPeliculas.repository;

import com.josedev72.ApiPeliculas.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {


    Pelicula getPeliculaById(long id);
}
