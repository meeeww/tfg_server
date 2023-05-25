package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_pedido")
    @JsonProperty("numero_pedido")
    private int numero_pedido;

    @Column(name = "id_usuario")
    @JsonProperty("id_usuario")
    private int id_usuario;

    @Column(name = "direccion_envio")
    @JsonProperty("direccion_envio")
    private String direccion_envio;

    @Column(name = "estado")
    @JsonProperty("estado")
    private int estado;

    @Column(name = "preciototal")
    @JsonProperty("preciototal")
    private float preciototal;

    public Pedidos(){}

    public Pedidos(int numero_pedido, int id_usuario, String direccion_envio, int estado, float preciototal) {
        this.numero_pedido = numero_pedido;
        this.id_usuario = id_usuario;
        this.direccion_envio = direccion_envio;
        this.estado = estado;
        this.preciototal= preciototal;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public void setNumero_pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(float preciototal) {
        this.preciototal = preciototal;
    }

    
}
