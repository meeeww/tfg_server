package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class InfoService {

    @Autowired
    private InfoRepo infoRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Info> ConsultarInfoPedidos() {
        List<Info> listaPedidos = infoRepo.getPedidos();
        return listaPedidos;
    }

    public List<Info> BuscarInfoPedidoPorIdYNumero(Set<Integer> id, Set<Integer> numero) {
        List<Info> listaPedidos = infoRepo.getPedido(id, numero);
        return listaPedidos;
    }

    public List<Info> BuscarInfoPedidoPorNumero(Set<Integer> numero) {
        List<Info> listaPedidos = infoRepo.getPedidoPorId(numero);
        return listaPedidos;
    }

    public List<Info> BuscarInfoPedidoPorId(Set<Integer> id) {
        List<Info> listaPedidos = infoRepo.getPedidoPorUsuario(id);
        return listaPedidos;
    }
    
    public void CrearInfoPedido(int numero, int id, Date fecha, int cantidad) {
        infoRepo.crearPedido(numero, id, fecha, cantidad);
    }

    public void ModificarInfoPedido(int cantidad, int numero, int id) {
        infoRepo.modificarPedidoNombrePorId(cantidad, numero, id);
    }

    public void EliminarInfoPedido(int numero, int id) {
        infoRepo.eliminarPedidoPorId(numero, id);
    }
}
