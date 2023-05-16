package com.example.demo.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table (name = "trabajos")
public class Trabajos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajo")
    @JsonProperty("id_trabajo")
    private int id_trabajo;

    @Column(name = "id_usuario")
    @JsonProperty("id_usuario")
    private int id_usuario;

    @Column(name = "segundo_apellido")
    @JsonProperty("segundo_apellido")
    private String segundo_apellido;

    @Column(name = "ssc")
    @JsonProperty("ssc")
    private String ssc;

    @Column(name = "codigo_postal")
    @JsonProperty("codigo_postal")
    private String codigo_postal;

    @Column(name = "ciudad")
    @JsonProperty("ciudad")
    private String ciudad;

    @Column(name = "condado")
    @JsonProperty("condado")
    private String condado;

    @Column(name = "estado")
    @JsonProperty("estado")
    private String estado;

    @Column(name = "puesto_trabajo")
    @JsonProperty("puesto_trabajo")
    private String puesto_trabajo;

    @Column(name = "fecha_nacimiento")
    @JsonProperty("fecha_nacimiento")
    private Date fecha_nacimiento;

    public Trabajos(){
    }

    public Trabajos(int id_usuario, int id_trabajo, String segundo_apellido, String ssc, String codigo_postal,
            String ciudad, String condado, String estado, String puesto_trabajo, Date fecha_nacimiento) {
        this.id_usuario = id_usuario;
        this.id_trabajo = id_trabajo;
        this.segundo_apellido = segundo_apellido;
        this.ssc = ssc;
        this.codigo_postal = codigo_postal;
        this.ciudad = ciudad;
        this.condado = condado;
        this.estado = estado;
        this.puesto_trabajo = puesto_trabajo;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_trabajo() {
        return id_trabajo;
    }

    public void setId_trabajo(int id_trabajo) {
        this.id_trabajo = id_trabajo;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getSsc() {
        return ssc;
    }

    public void setSsc(String ssc) {
        this.ssc = ssc;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCondado() {
        return condado;
    }

    public void setCondado(String condado) {
        this.condado = condado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPuesto_trabajo() {
        return puesto_trabajo;
    }

    public void setPuesto_trabajo(String puesto_trabajo) {
        this.puesto_trabajo = puesto_trabajo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
