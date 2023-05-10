package com.example.demo.Respository;

import com.example.demo.Entity.Usuarios;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UsuariosRepo extends CrudRepository<Usuarios, Integer> {
    //consultar
    String getUsuariosQuery = "SELECT * FROM usuarios";

    @Query(nativeQuery = true, value = getUsuariosQuery)
    List<Usuarios> getUsuarios();

    //buscar
    String getUsuarioQuery = "SELECT * FROM usuarios WHERE id_usuario = :id";
    String getUsuarioCorreoQuery = "SELECT * FROM usuarios WHERE correo_usuario = :correo";

    @Query(nativeQuery = true, value = getUsuarioQuery)
    List<Usuarios> getUsuarioPorId(Set<Integer> id);

    @Query(nativeQuery = true, value = getUsuarioCorreoQuery)
    List<Usuarios> getUsuarioPorCorreo(String correo);

    //crear
    String crearUsuarioQuery = "INSERT INTO usuarios (nombre_usuario, apellido_usuario, correo_usuario, contra_usuario, numero_pedidos, fecha_registro, direccion, apartamento, nombre_edificio, opciones_entrega, permisos, telefono_usuario, numero_tarjeta, cvv, mes_caducidad) VALUES (:nombre, :apellido, :correo, :contra, :pedidos, :fecha, :direccion, :apartamento, :edificio, :opciones, :permisos, :telefono, :tarjeta, :cvv, :caducidad)";

    @Modifying
    @Query(nativeQuery = true, value = crearUsuarioQuery)
    void crearUsuario(String nombre, String apellido, String correo, String contra, int pedidos, Date fecha, String direccion,String apartamento, String edificio, String opciones, int permisos, int telefono, String tarjeta, String cvv, String caducidad);

    //modificar
    String modificarUsuarioNombreQuery = "UPDATE usuarios SET nombre_usuario = :nombre WHERE usuarios.id_usuario = :id";
    String modificarUsuarioApellidoQuery = "UPDATE usuarios SET apellido_usuario = :apellido WHERE usuarios.id_usuario = :id";
    String modificarUsuarioCorreoQuery = "UPDATE usuarios SET correo_usuario = :correo WHERE usuarios.id_usuario = :id";
    String modificarUsuarioContraQuery = "UPDATE usuarios SET contra_usuario = :contra WHERE usuarios.id_usuario = :id";
    String modificarUsuarioPedidosQuery = "UPDATE usuarios SET numero_pedidos = :pedidos WHERE usuarios.id_usuario = :id";
    String modificarUsuarioFechaQuery = "UPDATE usuarios SET fecha_registro = :fecha WHERE usuarios.id_usuario = :id";
    String modificarUsuarioDireccionQuery = "UPDATE usuarios SET direccion = :direccion WHERE usuarios.id_usuario = :id";
    String modificarUsuarioApartamentoQuery = "UPDATE usuarios SET apartamento = :apartamento WHERE usuarios.id_usuario = :id";
    String modificarUsuarioEdificioQuery = "UPDATE usuarios SET nombre_edificio = :edificio WHERE usuarios.id_usuario = :id";
    String modificarUsuarioOpcionesEntregaQuery = "UPDATE usuarios SET opciones_entrega = :opciones WHERE usuarios.id_usuario = :id";
    String modificarUsuarioPermisosQuery = "UPDATE usuarios SET permisos = :permisos WHERE usuarios.id_usuario = :id";
    String modificarUsuarioTelefonoQuery = "UPDATE usuarios SET telefono_usuario = :telefono WHERE usuarios.id_usuario = :id";
    String modificarUsuarioTarjetaQuery = "UPDATE usuarios SET numero_tarjeta = :tarjeta WHERE usuarios.id_usuario = :id";
    String modificarUsuarioCVVQuery = "UPDATE usuarios SET cvv = :cvv WHERE usuarios.id_usuario = :id";
    String modificarUsuarioCaducidadQuery = "UPDATE usuarios SET mes_caducidad = :caducidad WHERE usuarios.id_usuario = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioNombreQuery)
    void modificarUsuarioNombrePorId(Integer id, String nombre);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioApellidoQuery)
    void modificarUsuarioApellidoPorId(Integer id, String apellido);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioCorreoQuery)
    void modificarUsuarioCorreoPorId(Integer id, String correo);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioContraQuery)
    void modificarUsuarioContraPorId(Integer id, String contra);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioPedidosQuery)
    void modificarUsuarioPedidosPorId(Integer id, int pedidos);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioFechaQuery)
    void modificarUsuarioFechaPorId(Integer id, Date fecha);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioDireccionQuery)
    void modificarUsuarioDireccionPorId(Integer id, String direccion);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioApartamentoQuery)
    void modificarUsuarioApartamentoPorId(Integer id, String apartamento);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioEdificioQuery)
    void modificarUsuarioEdificioPorId(Integer id, String edificio);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioOpcionesEntregaQuery)
    void modificarUsuarioOpcionesEntregaPorId(Integer id, String opciones);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioPermisosQuery)
    void modificarUsuarioPermisosPorId(Integer id, int permisos);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioTelefonoQuery)
    void modificarUsuarioTelefonoPorId(Integer id, int telefono);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioTarjetaQuery)
    void modificarUsuarioTarjetaPorId(Integer id, String tarjeta);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioCVVQuery)
    void modificarUsuarioCVVPorId(Integer id, String cvv);

    @Modifying
    @Query(nativeQuery = true, value = modificarUsuarioCaducidadQuery)
    void modificarUsuarioCaducidadPorId(Integer id, String caducidad);

    //borrar
    String borrarUsuarioQuery = "DELETE FROM usuarios WHERE id_usuario = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarUsuarioQuery)
    void eliminarUsuarioPorId(Integer id);
}
