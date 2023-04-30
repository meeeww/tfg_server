package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categorias {
    @Id
    @Column(name = "ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;

    @Column(name = "NOMBRE_CATEGORIA")
    private String nombre_categoria;

    public Categorias() {

    }

    public Categorias(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "id_categoria=" + id_categoria +
                ", nombre_categoria='" + nombre_categoria + '\'' +
                '}';
    }
}
