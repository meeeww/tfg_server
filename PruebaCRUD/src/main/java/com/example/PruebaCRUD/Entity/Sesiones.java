package com.example.PruebaCRUD.Entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "sesiones")
public class Sesiones {

    @Column(name = "idUsuario")
    private int idUsuario;
    @Column(name = "token")
    private String token;
    @Column(name = "dispositivo")
    private String dispositivo;
    @Column(name = "fecha")
    private Date fecha;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
