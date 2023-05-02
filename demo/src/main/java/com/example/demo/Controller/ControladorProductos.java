package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.CaracteristicasService;
import com.example.demo.Service.ProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorProductos {

    @Autowired
    private ProductosService impl;

    //-----------------------------------------PRODUCTOS-----------------------------------------\\

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/productos/consultar")
    public List<Productos> consultarProductosQuery(){
        return impl.ConsultarProductos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/productos/buscar")
    public List<Productos> buscarProductoQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarProducto(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/productos/crear")
    public void crearProductoQuery(@RequestBody Productos producto){
        impl.CrearProducto(producto.getNombre_producto(), producto.getDescripcion_producto(), producto.getFoto_producto(), producto.getCoste_base(), producto.getStock(), producto.getId_categoria(), producto.getId_caracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar")
    public void modificarCaracteristicaQuery( @RequestBody Productos producto){
        impl.ModificarProducto(producto.getId_producto(), producto.getNombre_producto(), producto.getDescripcion_producto(), producto.getFoto_producto(), producto.getCoste_base(), producto.getStock(), producto.getId_categoria(), producto.getId_categoria());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/nombre")
    public void modificarCaracteristicaNombreQuery( @RequestBody Productos producto){
        impl.ModificarProductoNombre(producto.getId_producto(), producto.getNombre_producto());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/descripcion")
    public void modificarCaracteristicaDescripcionQuery( @RequestBody Productos producto){
        impl.ModificarProductoDescripcion(producto.getId_producto(), producto.getDescripcion_producto());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/foto")
    public void modificarCaracteristicaFotoQuery( @RequestBody Productos producto){
        impl.ModificarProductoFoto(producto.getId_producto(), producto.getFoto_producto());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/coste")
    public void modificarCaracteristicaCosteQuery( @RequestBody Productos producto){
        impl.ModificarProductoCoste(producto.getId_producto(), producto.getCoste_base());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/stock")
    public void modificarCaracteristicaStockQuery( @RequestBody Productos producto){
        impl.ModificarProductoStock(producto.getId_producto(), producto.getStock());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/categoria")
    public void modificarCaracteristicaCategoriaQuery( @RequestBody Productos producto){
        impl.ModificarProductoCategoria(producto.getId_producto(), producto.getId_categoria());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/productos/modificar/caracteristica")
    public void modificarCaracteristicaCaracteristicaQuery( @RequestBody Productos producto){
        impl.ModificarProductoCaracteristica(producto.getId_producto(), producto.getId_caracteristica());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/productos/eliminar")
    public void eliminarProductoQuery( @RequestBody Productos producto){
        impl.EliminarProducto(producto.getId_producto());
    }
}
