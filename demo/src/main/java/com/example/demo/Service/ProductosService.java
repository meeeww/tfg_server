package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepo productosRepo;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    public List<Productos> ConsultarProductos() {
        List<Productos> listaProductos = productosRepo.getProductos();
        return listaProductos;
    }

    public List<Productos> BuscarProducto(Set<Integer> id) {
        List<Productos> listaProductos = productosRepo.getProductoPorId(id);
        return listaProductos;
    }
    
    public void CrearProducto(String nombre, String descripcion, String foto, double coste, int stock, int categoria, int caracteristica) {
        productosRepo.crearProducto(nombre, descripcion, foto, coste, stock, categoria, caracteristica);
    }

    public void ModificarProducto(Integer id, String nombre, String descripcion, String foto, double coste, int stock, int categoria, int caracteristica) {
        productosRepo.modificarProductoPorId(id, nombre, descripcion, foto, coste, stock, categoria, caracteristica);
    }

    public void ModificarProductoNombre(Integer id, String nombre) {
        productosRepo.modificarProductoNombrePorId(id, nombre);
    }

    public void ModificarProductoDescripcion(Integer id, String descripcion) {
        productosRepo.modificarProductoDescripcionPorId(id, descripcion);
    }

    public void ModificarProductoFoto(Integer id, String foto) {
        productosRepo.modificarProductoFotoPorId(id, foto);
    }

    public void ModificarProductoCoste(Integer id, double coste) {
        productosRepo.modificarProductoCostePorId(id, coste);
    }

    public void ModificarProductoStock(Integer id, Integer stock) {
        productosRepo.modificarProductoStockPorId(id, stock);
    }

    public void ModificarProductoCategoria(Integer id, Integer categoria) {
        productosRepo.modificarProductoCategoriaPorId(id, categoria);
    }

    public void ModificarProductoCaracteristica(Integer id, Integer caracteristica) {
        productosRepo.modificarProductoCaracteristicaPorId(id, caracteristica);
    }

    public void ModificarProductoVenta(Integer id, int ventas){
        productosRepo.modificarProductoVentaPorId(id, ventas);
    }

    public void EliminarProducto(Integer id) {
        productosRepo.eliminarProductoPorId(id);
    }

    //productos

    
}
