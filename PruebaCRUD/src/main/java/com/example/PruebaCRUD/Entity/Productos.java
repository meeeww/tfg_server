package com.example.PruebaCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Column(name = "descripcionProducto")
    private String descripcionProducto;
    @Column(name = "fotoProducto")
    private String fotoProducto;
    @Column(name = "costeBase")
    private double costeBase;
    @Column(name = "stock")
    private int stock;
    @Column(name = "idCategoria")
    private int idCategoria;
    @Column(name = "idCaracteristicas")
    private int idCaracteristicas;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(String fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public double getCosteBase() {
        return costeBase;
    }

    public void setCosteBase(double costeBase) {
        this.costeBase = costeBase;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCaracteristicas() {
        return idCaracteristicas;
    }

    public void setIdCaracteristicas(int idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

}
