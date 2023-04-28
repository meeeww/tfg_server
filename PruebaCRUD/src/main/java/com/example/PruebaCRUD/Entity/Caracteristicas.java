package com.example.PruebaCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "caracteristicas")
public class Caracteristicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCaracteristicas")
    private int idCaracteristicas;
    @Column(name = "nombreCaracteristica")
    private int nombreCaracteristica;

    public int getId() {
        return idCaracteristicas;
    }

    public void setId(int idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

    public int getNombreCaracteristica() {
        return nombreCaracteristica;
    }

    public void setNombreCaracteristica(int nombreCaracteristica) {
        this.nombreCaracteristica = nombreCaracteristica;
    }
}
