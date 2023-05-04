package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CaracteristicasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorCaracteristicas {

    @Autowired
    private CaracteristicasService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/caracteristicas/consultar")
    public List<Caracteristicas> consultarCaracteristicasQuery(){
        return impl.ConsultarCaracteristicas();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/caracteristicas/buscar")
    public List<Caracteristicas> buscarCaracteristicaQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarCaracteristica(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/caracteristicas/crear")
    public void crearCaracteristicaQuery(@RequestBody Caracteristicas caracteristica){
        impl.CrearCaracteristica(caracteristica.getNombreCaracteristica(), caracteristica.getValorCaracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/caracteristicas/modificar")
    public void modificarCaracteristicaQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristica(caracteristicas.getId(), caracteristicas.getNombreCaracteristica(), caracteristicas.getValorCaracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/caracteristicas/modificar/nombre")
    public void modificarCaracteristicaNombreQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristicaNombre(caracteristicas.getId(), caracteristicas.getNombreCaracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/caracteristicas/modificar/valor")
    public void modificarCaracteristicaValorQuery( @RequestBody Caracteristicas caracteristicas){
        impl.ModificarCaracteristicaValor(caracteristicas.getId(), caracteristicas.getValorCaracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/caracteristicas/eliminar")
    public void eliminarCaracteristicaQuery( @RequestBody Caracteristicas caracteristica){
        impl.EliminarCaracteristica(caracteristica.getId());
    }
}
