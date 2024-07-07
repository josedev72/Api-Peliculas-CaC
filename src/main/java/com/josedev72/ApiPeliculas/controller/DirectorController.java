package com.josedev72.ApiPeliculas.controller;

import com.josedev72.ApiPeliculas.model.Director;
import com.josedev72.ApiPeliculas.service.DirectorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Director")
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @GetMapping(value = "/mostrarById/{id}")
    public Director listById(@PathVariable Long id) {
        return directorService.findById(id);
    }

    @GetMapping(value = "/mostrarTodos")
    public List<Director> getDirectores() {
        return directorService.getAllDirectores();
    }

    @PostMapping(value = "/crear")
    public String crearDirector(@RequestBody Director director) {
        directorService.guardarDirector(director);
        return "Director guardado";
    }

    @PutMapping(value = "/editar")
    public String editDirector(@RequestBody Director director) {
        directorService.actualizarDirector(director);
        return "Director actualizado";
    }

    @DeleteMapping(value = "/eliminar")
    public String eliminarDirector(@RequestBody Director director) {
        directorService.eliminarDirector(director.getId());
        return "Director eliminado";
    }
}
