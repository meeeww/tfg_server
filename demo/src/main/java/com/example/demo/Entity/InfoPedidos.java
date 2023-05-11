package com.example.demo.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "infopedidos")
public class InfoPedidos {

    @Id
    @Column(name = "numero_pedido")
    @JsonProperty("numero_pedido")
    private int numero_pedido;

    @Column(name = "id_producto")
    @JsonProperty("id_producto")
    private int id_producto;

    @Column(name = "fecha")
    @JsonProperty("fecha")
    private Date fecha;

    public InfoPedidos(){}

    public InfoPedidos(int numero_pedido, int id_producto, Date fecha) {
        this.numero_pedido = numero_pedido;
        this.id_producto = id_producto;
        this.fecha = fecha;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
}
