package com.example.PruebaCRUD.Entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table (name = "infoPedidos")
public class InfoPedidos {

    @Column(name = "numeroPedido")
    private int numeroPedido;
    @Column(name = "idProductos")
    private String idProductos;
    @Column(name = "fecha")
    private Date fecha;
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public String getIdProductos() {
        return idProductos;
    }
    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
