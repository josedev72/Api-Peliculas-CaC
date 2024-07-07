package com.josedev72.ApiPeliculas.service;

import com.josedev72.ApiPeliculas.model.Usuario;
import com.josedev72.ApiPeliculas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUsuarioByNombre(long id) {
        return usuarioRepository.getUsuarioById(id);
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public void guardarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(long id) {
        usuarioRepository.deleteById(id);
    }

    public void actualizarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
