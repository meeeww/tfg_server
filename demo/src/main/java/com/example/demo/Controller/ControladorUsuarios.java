package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorUsuarios {

    @Autowired
    private UsuariosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/consultar")
    public List<Usuarios> consultarUsuariosQuery(){
        return impl.ConsultarUsuarios();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/buscar")
    public List<Usuarios> buscarUsuarioQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarUsuario(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/usuarios/buscar/login")
    public List<Usuarios> buscarUsuarioCorreoQuery( @RequestParam(value = "correo") String correo){
        return impl.BuscarUsuarioCorreo(correo);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/usuarios/crear")
    public void crearUsuarioQuery(@RequestBody Usuarios usuario){
        impl.CrearUsuario(usuario.getNombre_usuario(), usuario.getApellido_usuario(), usuario.getCorreo_usuario(), usuario.getContra_usuario(), usuario.getNumero_pedidos(), usuario.getFecha_registro(), usuario.getDireccion(), usuario.getApartamento(), usuario.getNombre_edificio(), usuario.getOpciones_entrega(), usuario.getPermisos(), usuario.getTelefono_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/nombre")
    public void modificarUsuarioNombreQuery( @RequestBody Usuarios usuario){
        impl.ModificarUsuarioNombre(usuario.getId_usuario(), usuario.getNombre_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/apellido")
    public void modificarUsuarioApellidoQuery( @RequestBody Usuarios usuario){
        impl.ModificarUsuarioApellido(usuario.getId_usuario(), usuario.getApellido_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/correo")
    public void modificarUsuarioCorreoQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioCorreo(usuario.getId_usuario(), usuario.getCorreo_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/contra")
    public void modificarUsuarioContraQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioContra(usuario.getId_usuario(), usuario.getContra_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/pedidos")
    public void modificarUsuarioPedidosQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioPedidos(usuario.getId_usuario(), usuario.getNumero_pedidos());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/fecha")
    public void modificarUsuarioFechaQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioFechaRegistro(usuario.getId_usuario(), usuario.getFecha_registro());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/direccion")
    public void modificarUsuarioDireccionQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioDireccion(usuario.getId_usuario(), usuario.getDireccion());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/apartamento")
    public void modificarUsuarioApartamentoQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioApartamento(usuario.getId_usuario(), usuario.getApartamento());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/edificio")
    public void modificarUsuarioEdificioQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioEdificio(usuario.getId_usuario(), usuario.getNombre_edificio());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/opciones")
    public void modificarUsuarioOpcionesEntregaQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioOpciones(usuario.getId_usuario(), usuario.getOpciones_entrega());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/permisos")
    public void modificarUsuarioPermisosQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioPermisos(usuario.getId_usuario(), usuario.getPermisos());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/usuarios/modificar/telefono")
    public void modificarUsuarioTelefonoQuery(@RequestBody Usuarios usuario){
        impl.ModificarUsuarioTelefono(usuario.getId_usuario(), usuario.getTelefono_usuario());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/usuarios/eliminar")
    public void eliminarUsuarioQuery( @RequestBody Usuarios usuario){
        impl.EliminarUsuario(usuario.getId_usuario());
    }
}
