package com.example.PruebaCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "caracteristicas")
public class Caracteristicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caracteristicas")
    private int idCaracteristicas;
    @Column(name = "nombre_caracteristica")
    private String nombreCaracteristica;

    public int getId() {
        return idCaracteristicas;
    }

    public void setId(int idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

    public String getNombreCaracteristica() {
        return nombreCaracteristica;
    }

    public void setNombreCaracteristica(String nombreCaracteristica) {
        this.nombreCaracteristica = nombreCaracteristica;
    }
}
