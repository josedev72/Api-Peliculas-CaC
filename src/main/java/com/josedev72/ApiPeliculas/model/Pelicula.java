package com.josedev72.ApiPeliculas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pelicula {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private int genero;
    private int calificacion;
    private int anio;

    @ManyToOne
    private Estrellas estrellas;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;
}
