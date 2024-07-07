package com.josedev72.ApiPeliculas.repository;

import com.josedev72.ApiPeliculas.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Long> {


    Director getDirectorById(long id);
}
