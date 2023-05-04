package com.example.demo.Respository;

import com.example.demo.Entity.Sesiones;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface SesionesRepo extends CrudRepository<Sesiones, Integer> {
    //consultar
    String getSesionesQuery = "SELECT * FROM sesiones";

    @Query(nativeQuery = true, value = getSesionesQuery)
    List<Sesiones> getSesiones();

    //buscar
    String getSesionQuery = "SELECT * FROM sesiones WHERE token = :token";

    @Query(nativeQuery = true, value = getSesionQuery)
    List<Sesiones> getSesionPorToken(String token);

    //crear
    String crearSesionQuery = "INSERT INTO sesiones (id_usuario, token, dispositivo, fecha) VALUES (:id, :token, :dispositivo, :fecha)";

    @Modifying
    @Query(nativeQuery = true, value = crearSesionQuery)
    void crearSesion(int id, String token, String dispositivo, Date fecha);

    //modificar
    String modificarSesionFechaQuery = "UPDATE sesiones SET fecha = :fecha WHERE sesiones.token = :token";

    @Modifying
    @Query(nativeQuery = true, value = modificarSesionFechaQuery)
    void modificarSesionFechaPorToken(Date fecha, String token);

    //borrar
    String borrarSesionQuery = "DELETE FROM sesiones WHERE token = :token";

    @Modifying
    @Query(nativeQuery = true, value = borrarSesionQuery)
    void eliminarSesionPorToken(String token);
}
