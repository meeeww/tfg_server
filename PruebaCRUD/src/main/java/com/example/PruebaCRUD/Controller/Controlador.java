package com.example.PruebaCRUD.Controller;

import com.example.PruebaCRUD.Entity.*;
import com.example.PruebaCRUD.Service.ServiceIMPL.PSIMP;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    public void crearCaracteristicaQuery(@RequestBody Caracteristicas caracteristica){
        impl.CrearCaracteristica(caracteristica.getNombreCaracteristica(), caracteristica.getValorCaracteristica());
    }

    @PutMapping("/caracteristicas/modificar")
    public void modificarCaracteristicaQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristica(caracteristicas.getId(), caracteristicas.getNombreCaracteristica(), caracteristicas.getValorCaracteristica());
    }

    @PutMapping("/caracteristicas/modificar/nombre")
    public void modificarCaracteristicaNombreQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristicaNombre(caracteristicas.getId(), caracteristicas.getNombreCaracteristica());
    }

    @PutMapping("/caracteristicas/modificar/valor")
    public void modificarCaracteristicaValorQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristicaValor(caracteristicas.getId(), caracteristicas.getValorCaracteristica());
    }

    @DeleteMapping("/caracteristicas/eliminar")
    public void eliminarCaracteristicaQuery( @RequestBody Caracteristicas caracteristica){
        impl.EliminarCaracteristica(caracteristica.getId());
    }
}
