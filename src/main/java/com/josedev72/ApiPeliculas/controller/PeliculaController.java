package com.josedev72.ApiPeliculas.controller;

import com.josedev72.ApiPeliculas.model.Pelicula;
import com.josedev72.ApiPeliculas.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping(value = "/mostrarById/{id}")
    public Pelicula listById(@PathVariable Long id) {
        return peliculaService.findById(id);
    }

    @GetMapping(value = "/mostrarTodas")
    public List<Pelicula> getPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    @PostMapping(value = "/crear")
    public String crearPelicula(@RequestBody Pelicula pelicula) {
        peliculaService.guardarPelicula(pelicula);
        return "Pelicula guardada";
    }

     @PutMapping(value = "/editar")
    public String editPelicula(@RequestBody Pelicula pelicula) {
        peliculaService.actualizarPelicula(pelicula);
        return "Película actualizada";
    }

    @DeleteMapping(value = "/eliminar")
    public String eliminarPelicula(@RequestBody Pelicula pelicula) {
        peliculaService.eliminarPelicula(pelicula.getId());
        return "Película eliminada";
    }
}
