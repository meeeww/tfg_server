package com.example.demo.Respository;

import com.example.demo.Entity.Trabajos;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TrabajosRepo extends CrudRepository<Trabajos, Integer> {
    //consultar
    String getTrabajosQuery = "SELECT * FROM trabajos";

    @Query(nativeQuery = true, value = getTrabajosQuery)
    List<Trabajos> getTrabajos();

    //buscar
    String getTrabajoQuery = "SELECT * FROM trabajos WHERE id_usuario = :id";

    @Query(nativeQuery = true, value = getTrabajoQuery)
    List<Trabajos> getTrabajoPorId(Set<Integer> id);

    //crear
    String crearTrabajoQuery = "INSERT INTO trabajos (id_usuario, segundo_apellido, ssc, codigo_postal, ciudad, condado, estado, puesto_trabajo, fecha_nacimiento ) VALUES (:id_usuario, :segundo_apellido, :ssc, :codigo_postal, :ciudad, :condado, :estado, :puesto_trabajo, :fecha_nacimiento)";

    @Modifying
    @Query(nativeQuery = true, value = crearTrabajoQuery)
    void crearTrabajo(int id_usuario, String segundo_apellido, String ssc, String codigo_postal, String ciudad, String condado, String estado, String puesto_trabajo, Date fecha_nacimiento);

    //modificar
    String modificarTrabajoIdUsuarioQuery = "UPDATE trabajos SET id_usuario = :id_usuario WHERE trabajos.id_usuario = :id";
    String modificarTrabajoSegundoApellidoQuery = "UPDATE trabajos SET segundo_apellido = :segundo_apellido WHERE trabajos.segundo_apellido = :id";
    String modificarTrabajoSSCQuery = "UPDATE trabajos SET ssc = :ssc WHERE trabajos.ssc = :id";
    String modificarTrabajoCodigoPostalQuery = "UPDATE trabajos SET codigo_postal = :codigo_postal WHERE trabajos.codigo_postal = :id";
    String modificarTrabajoCiudadQuery = "UPDATE trabajos SET ciudad = :ciudad WHERE trabajos.ciudad = :id";
    String modificarTrabajoCondadoQuery = "UPDATE trabajos SET condado = :condado WHERE trabajos.condado = :id";
    String modificarTrabajoEstadoQuery = "UPDATE trabajos SET estado = :estado WHERE trabajos.estado = :id";
    String modificarTrabajoPuestoTrabajoQuery = "UPDATE trabajos SET puesto_trabajo = :puesto_trabajo WHERE trabajos.puesto_trabajo = :id";
    String modificarTrabajoFechaNacimientoQuery = "UPDATE trabajos SET fecha_nacimiento = :fecha_nacimiento WHERE trabajos.fecha_nacimiento = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoIdUsuarioQuery)
    void modificarTrabajoIdUsuarioPorId(Integer id, int id_usuario);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoSegundoApellidoQuery)
    void modificarTrabajoSegundoApellidoPorId(Integer id, String segundo_apellido);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoSSCQuery)
    void modificarTrabajoSSCPorId(Integer id, String ssc);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoCodigoPostalQuery)
    void modificarTrabajoCodigoPostalPorId(Integer id, String codigo_postal);
    
    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoCiudadQuery)
    void modificarTrabajoCiudadPorId(Integer id, String ciudad);
    
    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoCondadoQuery)
    void modificarTrabajoCondadoPorId(Integer id, String condado);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoEstadoQuery)
    void modificarTrabajoEstadoPorId(Integer id, String estado);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoPuestoTrabajoQuery)
    void modificarTrabajoPuestoTrabajoPorId(Integer id, String puesto_trabajo);

    @Modifying
    @Query(nativeQuery = true, value = modificarTrabajoFechaNacimientoQuery)
    void modificarTrabajoFechaNacimientoPorId(Integer id, Date fecha_nacimiento);

    //borrar
    String borrarTrabajoQuery = "DELETE FROM trabajos WHERE id_trabajo = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarTrabajoQuery)
    void eliminarTrabajoPorId(Integer id);
}
