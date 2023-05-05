package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.SesionesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API")
public class ControladorSesiones {

    @Autowired
    private SesionesService impl;

    //-----------------------------------------sesiones-----------------------------------------\\

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/sesiones/consultar")
    public List<Sesiones> consultarSesionesQuery(){
        return impl.ConsultarSesiones();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/sesiones/buscar")
    public List<Sesiones> buscarSesionQuery( @RequestParam(value = "token") String token){
        return impl.BuscaSesion(token);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/sesiones/crear")
    public void crearSesionQuery(@RequestBody Sesiones sesion){
        impl.CrearSesion(sesion.getId_usuario(), sesion.getToken(), sesion.getDispositivo(), sesion.getFecha());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/sesiones/modificar")
    public void modificarSesionQuery( @RequestBody Sesiones sesion){
        impl.ModificarSesionFecha(sesion.getToken(), sesion.getFecha());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/sesiones/eliminar")
    public void eliminarSesionQuery( @RequestBody Sesiones sesion){
        impl.EliminarSesion(sesion.getToken());
    }
}
