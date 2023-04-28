package com.example.PruebaCRUD.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "pedidos")
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroPedido")
    private int numeroPedido;
    @Column(name = "idUsuario")
    private int idUsuario;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "completado")
    private Boolean completado;

    public int getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public int getIdProductos() {
        return idUsuario;
    }
    public void setIdProductos(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Boolean getCompletado() {
        return completado;
    }
    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }
}
