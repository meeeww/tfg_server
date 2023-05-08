package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepo usuariosRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Usuarios> ConsultarUsuarios() {
        List<Usuarios> listaUsuarios = usuariosRepo.getUsuarios();
        return listaUsuarios;
    }

    public List<Usuarios> BuscarUsuario(Set<Integer> id) {
        List<Usuarios> listaUsuario = usuariosRepo.getUsuarioPorId(id);
        return listaUsuario;
    }

    public List<Usuarios> BuscarUsuarioCorreo(String correo) {
        List<Usuarios> listaUsuario = usuariosRepo.getUsuarioPorCorreo(correo);
        return listaUsuario;
    }
    
    public void CrearUsuario(String nombre, String apellido, String correo, String contra, int pedidos, Date fecha, String direccion,String apartamento, String edificio, String opciones, int permisos, int telefono) {
        usuariosRepo.crearUsuario(nombre, apellido, correo, contra, pedidos, fecha, direccion, apartamento, edificio, opciones, permisos, telefono);
    }

    public void ModificarUsuarioNombre(Integer id, String nombre) {
        usuariosRepo.modificarUsuarioNombrePorId(id, nombre);
    }

    public void ModificarUsuarioApellido(Integer id, String apellido){
        usuariosRepo.modificarUsuarioApellidoPorId(id, apellido);
    }

    public void ModificarUsuarioCorreo(Integer id, String correo){
        usuariosRepo.modificarUsuarioCorreoPorId(id, correo);
    }

    public void ModificarUsuarioContra(Integer id, String contra){
        usuariosRepo.modificarUsuarioContraPorId(id, contra);
    }

    public void ModificarUsuarioPedidos(Integer id, int numero){
        usuariosRepo.modificarUsuarioPedidosPorId(id, numero);
    }

    public void ModificarUsuarioFechaRegistro(Integer id, Date fecha){
        usuariosRepo.modificarUsuarioFechaPorId(id, fecha);
    }

    public void ModificarUsuarioDireccion(Integer id, String direccion){
        usuariosRepo.modificarUsuarioDireccionPorId(id, direccion);
    }

    public void ModificarUsuarioApartamento(Integer id, String apartamento){
        usuariosRepo.modificarUsuarioApartamentoPorId(id, apartamento);
    }

    public void ModificarUsuarioEdificio(Integer id, String edificio){
        usuariosRepo.modificarUsuarioEdificioPorId(id, edificio);
    }

    public void ModificarUsuarioOpciones(Integer id, String opciones){
        usuariosRepo.modificarUsuarioOpcionesEntregaPorId(id, opciones);
    }

    public void ModificarUsuarioPermisos(Integer id, int permiso){
        usuariosRepo.modificarUsuarioPermisosPorId(id, permiso);
    }

    public void ModificarUsuarioTelefono(Integer id, int telefono){
        usuariosRepo.modificarUsuarioTelefonoPorId(id, telefono);
    }

    public void EliminarUsuario(Integer id) {
        usuariosRepo.eliminarUsuarioPorId(id);
    }
}
