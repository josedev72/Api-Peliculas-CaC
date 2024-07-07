package com.josedev72.ApiPeliculas.service;

import com.josedev72.ApiPeliculas.model.Pelicula;
import com.josedev72.ApiPeliculas.repository.PeliculaRepository;
import com.josedev72.ApiPeliculas.repository.EstrellaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;
    private EstrellaRepository estrellaRepository;


    public List<Pelicula> getAllPeliculas(){
        return peliculaRepository.findAll();
    }

    public void guardarPelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }
    public void eliminarPelicula(long id) {
        peliculaRepository.deleteById(id);
    }

    public void actualizarPelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    public Pelicula findById(Long id) {
        return peliculaRepository.findById(id).orElse(null);
    }
}
