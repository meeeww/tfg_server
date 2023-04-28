package com.example.PruebaCRUD.Controller;

import com.example.PruebaCRUD.Entity.*;
import com.example.PruebaCRUD.Service.ServiceIMPL.PSIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Controlador {

    @Autowired
    private PSIMP impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @GetMapping("/caracteristicas/consultar")
    public List<Caracteristicas> consultarCaracteristicasQuery(){
        return impl.ConsultarCaracteristicas();
    }

    @GetMapping("/caracteristicas/buscar")
    public List<Caracteristicas> buscarCaracteristicaQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarCaracteristica(id);
    }

    @PostMapping("/caracteristicas/crear")
    public List<Caracteristicas> crearCaracteristicaQuery( @RequestParam(value = "nombre") Set<String> nombre){
        return impl.CrearCaracteristica(nombre);
    }

    @PutMapping("/caracteristicas/modificar")
    public List<Caracteristicas> modificarCaracteristicaQuery( @RequestParam(value = "id") Set<Integer> id, @RequestParam(value = "nombre") Set<String> nombre){
        return impl.ModificarCaracteristica(id, nombre);
    }

    @DeleteMapping("/caracteristicas/eliminar")
    public List<Caracteristicas> eliminarCaracteristicaQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.EliminarCaracteristica(id);
    }
}
