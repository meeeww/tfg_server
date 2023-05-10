package com.example.demo.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    @JsonProperty("id_usuario")
    private int id_usuario;

    @Column(name = "nombre_usuario")
    @JsonProperty("nombre_usuario")
    private String nombre_usuario;

    @Column(name = "apellido_usuario")
    @JsonProperty("apellido_usuario")
    private String apellido_usuario;

    @Column(name = "correo_usuario")
    @JsonProperty("correo_usuario")
    private String correo_usuario;

    @Column(name = "contra_usuario")
    @JsonProperty("contra_usuario")
    private String contra_usuario;

    @Column(name = "numero_pedidos")
    @JsonProperty("numero_pedidos")
    private int numero_pedidos;

    @Column(name = "fecha_registro")
    @JsonProperty("fecha_registro")
    private Date fecha_registro;

    @Column(name = "direccion")
    @JsonProperty("direccion")
    private String direccion;

    @Column(name = "apartamento")
    @JsonProperty("apartamento")
    private String apartamento;

    @Column(name = "nombre_edificio")
    @JsonProperty("nombre_edificio")
    private String nombre_edificio;

    @Column(name = "opciones_entrega")
    @JsonProperty("opciones_entrega")
    private String opciones_entrega;

    @Column(name = "permisos")
    @JsonProperty("permisos")
    private int permisos;

    @Column(name = "telefono_usuario")
    @JsonProperty("telefono_usuario")
    private int telefono_usuario;

    @Column(name = "numero_tarjeta")
    @JsonProperty("numero_tarjeta")
    private String numero_tarjeta;

    @Column(name = "cvv")
    @JsonProperty("cvv")
    private String cvv;

    @Column(name = "mes_caducidad")
    @JsonProperty("mes_caducidad")
    private String mes_caducidad;

    public Usuarios() {
    }

    public Usuarios(int id_usuario, String nombre_usuario, String apellido_usuario, String correo_usuario,
            String contra_usuario, int numero_pedidos, Date fecha_registro, String direccion, String apartamento,
            String nombre_edificio, String opciones_entrega, int permisos, int telefono_usuario, String numero_tarjeta, String cvv, String mes_caducidad) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.contra_usuario = contra_usuario;
        this.numero_pedidos = numero_pedidos;
        this.fecha_registro = fecha_registro;
        this.direccion = direccion;
        this.apartamento = apartamento;
        this.nombre_edificio = nombre_edificio;
        this.opciones_entrega = opciones_entrega;
        this.permisos = permisos;
        this.telefono_usuario = telefono_usuario;
        this.numero_tarjeta = numero_tarjeta;
        this.cvv = cvv;
        this.mes_caducidad = mes_caducidad;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getContra_usuario() {
        return contra_usuario;
    }

    public void setContra_usuario(String contra_usuario) {
        this.contra_usuario = contra_usuario;
    }

    public int getNumero_pedidos() {
        return numero_pedidos;
    }

    public void setNumero_pedidos(int numero_pedidos) {
        this.numero_pedidos = numero_pedidos;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
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

    public String getNombre_edificio() {
        return nombre_edificio;
    }

    public void setNombre_edificio(String nombre_edificio) {
        this.nombre_edificio = nombre_edificio;
    }

    public String getOpciones_entrega() {
        return opciones_entrega;
    }

    public void setOpciones_entrega(String opciones_entrega) {
        this.opciones_entrega = opciones_entrega;
    }

    public int getPermisos() {
        return permisos;
    }

    public void setPermisos(int permisos) {
        this.permisos = permisos;
    }

    public int getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(int telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(String numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getMes_caducidad() {
        return mes_caducidad;
    }

    public void setMes_caducidad(String mes_caducidad) {
        this.mes_caducidad = mes_caducidad;
    }

    
}
