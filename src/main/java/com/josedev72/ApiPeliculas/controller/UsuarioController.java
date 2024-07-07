package com.josedev72.ApiPeliculas.controller;

import com.josedev72.ApiPeliculas.model.Usuario;
import com.josedev72.ApiPeliculas.repository.UsuarioRepository;
import com.josedev72.ApiPeliculas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/mostrarById/{id}")
    public Usuario listarUsuarioById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @GetMapping(value = "/mostrartodos")
    public List<Usuario> getUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @PostMapping(value = "/crear")
    public String crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
        return "Usuario guardado";
    }

    @PutMapping(value = "/editar")
    public String editUsuario(@RequestBody Usuario usuario) {
        usuarioService.actualizarUsuario(usuario);
        return "Usuario actualizado";
    }

    @DeleteMapping(value = "/eliminar")
    public String eliminarUsuario(@RequestBody Usuario usuario) {
        usuarioService.eliminarUsuario(usuario.getId());
        return "Usuario eliminado";
    }
}
