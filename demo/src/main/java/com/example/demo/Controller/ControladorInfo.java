package com.example.demo.Controller;

import com.example.demo.Entity.Info;
import com.example.demo.Service.InfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class ControladorInfo {

    @Autowired
    private InfoService impl;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/consultar")
    public List<Info> consultarPedidosQuery(){
        return impl.ConsultarInfoPedidos();
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar")
    public List<Info> buscarPedidoQuery( @RequestParam(value = "numero") Set<Integer> numero, @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedidoPorIdYNumero(numero, id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar/pedido")
    public List<Info> buscarPedidoNumeroQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedidoPorNumero(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/infopedidos/buscar/producto")
    public List<Info> buscarPedidoUsuaioQuery( @RequestParam(value = "id") Set<Integer> id){
        return impl.BuscarInfoPedidoPorId(id);
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/infopedidos/crear")
    public void crearPedidoQuery(@RequestBody Info info){
        impl.CrearInfoPedido(info.getNumero_pedido(), info.getId_producto(), info.getFecha(), info.getCantidad());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @PutMapping("/infopedidos/modificar")
    public void modificarPedidoPrecioQuery( @RequestBody Info info){
        impl.ModificarInfoPedido(info.getCantidad(), info.getNumero_pedido(), info.getId_producto());
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @DeleteMapping("/infopedidos/eliminar")
    public void eliminarPedidoQuery( @RequestBody Info info){
        impl.EliminarInfoPedido(info.getNumero_pedido(), info.getId_producto());
    }
}
