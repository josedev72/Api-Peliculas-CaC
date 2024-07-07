package com.josedev72.ApiPeliculas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenia;
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;
    private String nacionalidad;
}
