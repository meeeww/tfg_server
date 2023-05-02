package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    @JsonProperty("id_producto")
    private int id_producto;

    @Column(name = "nombre_producto")
    @JsonProperty("nombre_producto")
    private String nombre_producto;

    @Column(name = "descripcion_producto")
    @JsonProperty("descripcion_producto")
    private String descripcion_producto;

    @Column(name = "foto_producto")
    @JsonProperty("foto_producto")
    private String foto_producto;

    @Column(name = "coste_base")
    @JsonProperty("coste_base")
    private float coste_base;

    @Column(name = "stock")
    @JsonProperty("stock")
    private int stock;

    @Column(name = "id_categoria")
    @JsonProperty("id_categoria")
    private int id_categoria;

    @Column(name = "id_caracteristica")
    @JsonProperty("id_caracteristica")
    private int id_caracteristica;

    public Productos(){}

    public Productos(int id_producto, String nombre_producto, String descripcion_producto, String foto_producto,
            float coste_base, int stock, int id_categoria, int id_caracteristica) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.foto_producto = foto_producto;
        this.coste_base = coste_base;
        this.stock = stock;
        this.id_categoria = id_categoria;
        this.id_caracteristica = id_caracteristica;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getFoto_producto() {
        return foto_producto;
    }

    public void setFoto_producto(String foto_producto) {
        this.foto_producto = foto_producto;
    }

    public float getCoste_base() {
        return coste_base;
    }

    public void setCoste_base(float coste_base) {
        this.coste_base = coste_base;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_caracteristica() {
        return id_caracteristica;
    }

    public void setId_caracteristica(int id_caracteristica) {
        this.id_caracteristica = id_caracteristica;
    }

    
}
