package com.example.demo.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "sesiones")
public class Sesiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    @JsonProperty("id_usuario")
    private int id_usuario;

    @Column(name = "token")
    @JsonProperty("token")
    private String token;

    @Column(name = "dispositivo")
    @JsonProperty("dispositivo")
    private String dispositivo;

    @Column(name = "fecha")
    @JsonProperty("fecha")
    private Date fecha;

    public Sesiones() {
    }

    public Sesiones(int id_usuario, String token, String dispositivo, Date fecha) {
        this.id_usuario = id_usuario;
        this.token = token;
        this.dispositivo = dispositivo;
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
