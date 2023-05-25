package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PedidosService {

    @Autowired
    private PedidosRepo pedidosRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Pedidos> ConsultarPedidos() {
        List<Pedidos> listaPedidos = pedidosRepo.getPedidos();
        return listaPedidos;
    }

    public List<Pedidos> BuscarPedidoPorId(Set<Integer> id) {
        List<Pedidos> listaPedidos = pedidosRepo.getPedidoPorId(id);
        return listaPedidos;
    }

    public List<Pedidos> BuscarPedidoPorUsuario(Set<Integer> id) {
        List<Pedidos> listaPedidos = pedidosRepo.getPedidoPorUsuario(id);
        return listaPedidos;
    }

    public List<Pedidos> BuscarPedido(Set<Integer> id_usuario, Set<Integer> id_pedido) {
        List<Pedidos> listaPedidos = pedidosRepo.getPedido(id_usuario, id_pedido);
        return listaPedidos;
    }
    
    public void CrearPedido(int id, String direccion, int estado, double precio) {
        pedidosRepo.crearPedido(id, direccion, estado, precio);
    }

    public void ModificarPedido(Integer id, int estado) {
        pedidosRepo.modificarPedidoNombrePorId(id, estado);
    }

    public void ModificarPedidoPrecio(Integer id, float precio) {
        pedidosRepo.modificarPedidoPrecioPorId(id, precio);
    }

    public void EliminarPedido(Integer id) {
        pedidosRepo.eliminarPedidoPorId(id);
    }
}
