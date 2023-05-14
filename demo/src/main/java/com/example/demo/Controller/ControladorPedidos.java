package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.PedidosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorPedidos {

    @Autowired
    private PedidosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pedidos/consultar")
    public List<Pedidos> consultarPedidosQuery(){
        return impl.ConsultarPedidos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pedidos/buscar")
    public List<Pedidos> buscarPedidoQuery( @RequestParam(value = "id_usuario") Set<Integer> id_usuario, @RequestParam(value = "id_pedido") Set<Integer> id_pedido){
        return impl.BuscarPedido(id_usuario, id_pedido);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pedidos/buscar/pedido")
    public List<Pedidos> buscarPedidoNumeroQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarPedidoPorId(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pedidos/buscar/usuario")
    public List<Pedidos> buscarPedidoUsuaioQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarPedidoPorUsuario(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/pedidos/crear")
    public void crearPedidoQuery(@RequestBody Pedidos pedido){
        impl.CrearPedido(pedido.getId_usuario(), pedido.getDireccion_envio(), pedido.getEstado(), pedido.getPreciototal());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/pedidos/modificar/estado")
    public void modificarPedidoQuery( @RequestBody Pedidos pedido){
        impl.ModificarPedido(pedido.getNumero_pedido(), pedido.getEstado());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/pedidos/modificar/precio")
    public void modificarPedidoPrecioQuery( @RequestBody Pedidos pedido){
        impl.ModificarPedidoPrecio(pedido.getNumero_pedido(), pedido.getPreciototal());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/pedidos/eliminar")
    public void eliminarPedidoQuery( @RequestBody Pedidos pedido){
        impl.EliminarPedido(pedido.getNumero_pedido());
    }
}
