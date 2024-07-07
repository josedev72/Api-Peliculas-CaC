package com.josedev72.ApiPeliculas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "estrellas")
public class Estrellas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;



    private Estrellas(String nombre) {
        this.nombre = nombre;
    }

    public static final Estrellas UNO = new Estrellas("UNO");
    public static final Estrellas DOS = new Estrellas("DOS");
    public static final Estrellas TRES = new Estrellas("TRES");
    public static final Estrellas CUATRO = new Estrellas("CUATRO");
    public static final Estrellas CINCO = new Estrellas("CINCO");

}
