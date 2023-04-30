package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "caracteristicas")
public class Caracteristicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caracteristica")
    @JsonProperty("id_caracteristica")
    private int id_caracteristicas;
    @Column(name = "nombre_caracteristica")
    @JsonProperty("nombre_caracteristica")
    private String nombre_caracteristica;

    @Column(name = "valor_caracteristica")
    @JsonProperty("valor_caracteristica")
    private String valor_caracteristica;

    public Caracteristicas(){}

    public Caracteristicas(int idCaracteristicas, String nombreCaracteristica, String valorCaracteristica){
        setId(idCaracteristicas);
        setNombreCaracteristica(nombreCaracteristica);
        setValorCaracteristica(valorCaracteristica);
    }

    public int getId() {
        return id_caracteristicas;
    }

    public void setId(int idCaracteristicas) {
        this.id_caracteristicas = idCaracteristicas;
    }

    public String getNombreCaracteristica() {
        return nombre_caracteristica;
    }

    public void setNombreCaracteristica(String nombreCaracteristica) {
        this.nombre_caracteristica = nombreCaracteristica;
    }

    public String getValorCaracteristica(){ return valor_caracteristica;}

    public void setValorCaracteristica(String valorCaracteristica){
        this.valor_caracteristica = valorCaracteristica;
    }
}
