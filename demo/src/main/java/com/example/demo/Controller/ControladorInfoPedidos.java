package com.example.demo.Controller;

import com.example.demo.Entity.*;
import com.example.demo.Service.InfoPedidosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorInfoPedidos {

    @Autowired
    private InfoPedidosService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/consultar")
    public List<InfoPedidos> consultarInfoPedidoQuery(){
        return impl.ConsultarInfoPedidos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar")
    public List<InfoPedidos> buscarInfoPedidoQuery( @RequestParam(value = "numero") Set<Integer> numero, @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedido(numero, id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar/pedido")
    public List<InfoPedidos> buscarInfoPedidoPedidoQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedidoNumero(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar/producto")
    public List<InfoPedidos> buscarInfoPedidoProductoQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedidoProducto(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar/fecha")
    public List<InfoPedidos> buscarInfoPedidoFechaQuery( @RequestParam(value = "fecha") Date fecha){
        return impl.BuscarInfoPedidoFecha(fecha);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/infopedidos/crear")
    public void crearInfoPedidoQuery(@RequestBody InfoPedidos infoPedido){
        impl.CrearInfoPedido(infoPedido.getNumero_pedido(), infoPedido.getId_producto(), infoPedido.getFecha());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/infopedidos/modificar")
    public void modificarInfoPedidoQuery( @RequestBody InfoPedidos infoPedido){
        impl.ModificarInfoPedido(infoPedido.getFecha(), infoPedido.getNumero_pedido(), infoPedido.getId_producto());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/infopedidos/eliminar")
    public void eliminarInfoPedidoQuery( @RequestBody InfoPedidos infoPedido){
        impl.EliminarInfoPedido(infoPedido.getNumero_pedido());
    }
}
