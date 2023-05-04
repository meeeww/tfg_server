package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "categorias")
public class Categorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    @JsonProperty("id_categoria")
    private int id_categoria;

    @Column(name = "nombre_categoria")
    @JsonProperty("nombre_categoria")
    private String nombre_categoria;

    @Column(name = "descripcion_categoria")
    @JsonProperty("descripcion_categoria")
    private String descripcion_categoria;

    @Column(name = "foto_categoria")
    @JsonProperty("foto_categoria")
    private String foto_categoria;

    public Categorias(){}

    public Categorias(int id_categoria, String nombre_categoria, String descripcion_categoria, String foto_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion_categoria = descripcion_categoria;
        this.foto_categoria = foto_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }

    public String getFoto_categoria() {
        return foto_categoria;
    }

    public void setFoto_categoria(String foto_categoria) {
        this.foto_categoria = foto_categoria;
    }

    
}
