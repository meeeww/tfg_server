package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.TrabajosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")  
public class ControladorTrabajos {
    
    @Autowired
    private TrabajosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/trabajos/consultar")
    public List<Trabajos> consultarTrabajosQuery(){
        return impl.ConsultarTrabajos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/trabajos/crear")
    public void crearTrabajoQuery(@RequestBody Trabajos trabajo){
        impl.CrearTrabajo(trabajo.getId_usuario(), trabajo.getSegundo_apellido(), trabajo.getSsc(), trabajo.getCodigo_postal(), trabajo.getCiudad(), trabajo.getCondado(), trabajo.getEstado(), trabajo.getPuesto_trabajo(), trabajo.getFecha_nacimiento());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/trabajos/buscar")
    public List<Trabajos> buscarTrabajoQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarTrabajoPorId(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/trabajos/eliminar")
    public void eliminarTrabajoQuery( @RequestBody Trabajos trabajo){
        impl.EliminarTrabajo(trabajo.getId_usuario());
    }
}
