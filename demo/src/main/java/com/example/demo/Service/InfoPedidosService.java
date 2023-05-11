package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class InfoPedidosService {

    @Autowired
    private InfoPedidosRepo infoPedidosRepo;

    //-----------------------------------------Info Pedido-----------------------------------------\\
    public List<InfoPedidos> ConsultarInfoPedidos() {
        List<InfoPedidos> listaInfoPedidos = infoPedidosRepo.getInfoPedidos();
        return listaInfoPedidos;
    }

    public List<InfoPedidos> BuscarInfoPedido(Set<Integer> numero, Set<Integer> id) {
        List<InfoPedidos> listaInfoPedido = infoPedidosRepo.getInfoPedido(numero, id);
        return listaInfoPedido;
    }

    public List<InfoPedidos> BuscarInfoPedidoNumero(Set<Integer> id) {
        List<InfoPedidos> listaInfoPedido = infoPedidosRepo.getInfoPedidoPorPedido(id);
        return listaInfoPedido;
    }

    public List<InfoPedidos> BuscarInfoPedidoProducto(Set<Integer> id) {
        List<InfoPedidos> listaInfoPedido = infoPedidosRepo.getInfoPedidoPorProducto(id);
        return listaInfoPedido;
    }

    public List<InfoPedidos> BuscarInfoPedidoFecha(Date fecha) {
        List<InfoPedidos> listaInfoPedido = infoPedidosRepo.getInfoPedidoPorFecha(fecha);
        return listaInfoPedido;
    }
    
    public void CrearInfoPedido(Integer numero, Integer id, Date fecha) {
        infoPedidosRepo.crearInfoPedido(numero, id, fecha);
    }

    public void ModificarInfoPedido(Date fecha, Integer numero, Integer id) {
        infoPedidosRepo.modificarInfoPedido(fecha, numero, id);
    }

    public void EliminarInfoPedido(Integer id) {
        infoPedidosRepo.eliminarInfoPedido(id);
    }
}
