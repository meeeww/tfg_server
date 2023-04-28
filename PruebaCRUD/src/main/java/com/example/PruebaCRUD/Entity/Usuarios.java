package com.example.PruebaCRUD.Entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table (name = "persona")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private int idUsuario;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "contra")
    private String contra;
    @Column(name = "numeroPedidos")
    private int numeroPedidos;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "apartamento")
    private String apartamento;
    @Column(name = "nombreEdificio")
    private String nombreEdificio;
    @Column(name = "opcionesEntrega")
    private String opcionesEntrega;
    @Column(name = "telefono")
    private String telefono;

    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }
    public int getNumeroPedidos() {
        return numeroPedidos;
    }
    public void setNumeroPedidos(int numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getApartamento() {
        return apartamento;
    }
    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
    public String getNombreEdificio() {
        return nombreEdificio;
    }
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
    public String getOpcionesEntrega() {
        return opcionesEntrega;
    }
    public void setOpcionesEntrega(String opcionesEntrega) {
        this.opcionesEntrega = opcionesEntrega;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
