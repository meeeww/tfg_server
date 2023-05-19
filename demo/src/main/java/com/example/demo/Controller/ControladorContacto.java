package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.ContactosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")  
public class ControladorContacto {
    
    @Autowired
    private ContactosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/contactos/consultar")
    public List<Contactos> consultarContactosQuery(){
        return impl.ConsultarContactos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/contactos/crear")
    public void crearContactoQuery(@RequestBody Contactos contacto){
        impl.CrearContacto(contacto.getNombre(), contacto.getEmail(), contacto.getTelefono(), contacto.getMensaje());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/contactos/buscar")
    public List<Contactos> buscarContactosQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarContactoPorId(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/contactos/eliminar")
    public void eliminarContactoQuery( @RequestBody Contactos contacto){
        impl.EliminarContacto(contacto.getId_contacto());
    }

}
