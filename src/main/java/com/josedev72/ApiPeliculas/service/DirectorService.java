package com.josedev72.ApiPeliculas.service;

import com.josedev72.ApiPeliculas.model.Director;
import com.josedev72.ApiPeliculas.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorService {
    @Autowired
    private DirectorRepository directorRepository;


    public List<Director> getAllDirectores(){
        return directorRepository.findAll();
    }

    public void guardarDirector(Director director) {
        directorRepository.save(director);
    }
    public void eliminarDirector(long id) {
        directorRepository.deleteById(id);
    }

    public void actualizarDirector(Director director) {
        directorRepository.save(director);
    }

    public Director findById(Long id) {
        return directorRepository.findById(id).orElse(null);
    }
}
