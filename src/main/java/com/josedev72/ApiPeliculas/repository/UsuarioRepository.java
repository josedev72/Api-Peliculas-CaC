package com.josedev72.ApiPeliculas.repository;

import com.josedev72.ApiPeliculas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Usuario getUsuarioById(long id);
}
