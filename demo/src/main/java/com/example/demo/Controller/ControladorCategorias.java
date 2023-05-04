package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorCategorias {

    @Autowired
    private CategoriasService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/categorias/consultar")
    public List<Categorias> consultarCategoriasQuery(){
        return impl.ConsultarCategorias();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/categorias/buscar")
    public List<Categorias> buscarCategoriaQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarCategoria(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/categorias/crear")
    public void crearCategoriaQuery(@RequestBody Categorias categoria){
        impl.CrearCategoria(categoria.getNombre_categoria());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/categorias/modificar")
    public void modificarCategoriaQuery( @RequestBody Categorias categoria){
        impl.ModificarCategoriaValor(categoria.getId_categoria(), categoria.getNombre_categoria());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/categorias/eliminar")
    public void eliminarCategoriaQuery( @RequestBody Categorias categoria){
        impl.EliminarCategoria(categoria.getId_categoria());
    }
}
