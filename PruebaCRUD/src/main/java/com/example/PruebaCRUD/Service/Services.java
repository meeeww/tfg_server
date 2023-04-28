package com.example.PruebaCRUD.Service;

import com.example.PruebaCRUD.Entity.*;

import java.util.List;

public interface Services {

    public List<Caracteristicas> ConsultarCaracteristicas();
    public Caracteristicas CrearCaracteristicas(Caracteristicas caracteristica);
    public Caracteristicas ModificarCaracteristicas(Caracteristicas caracteristica);
    public Caracteristicas BuscarCaracteristicas(int id);
    public void EliminarCaracteristicas(int id);

    public List<Categorias> ConsultarCategorias();
    public Categorias CrearCategorias(Categorias categorias);
    public Categorias ModificarCategorias(Categorias categorias);
    public Categorias BuscarCategorias(int id);
    public void EliminarCategorias(int id);

    public List<InfoPedidos> ConsultarInfoPedidos();
    public InfoPedidos CrearInfoPedidos(InfoPedidos infoPedido);
    public InfoPedidos ModificarInfoPedidos(InfoPedidos infoPedido);
    public InfoPedidos BuscarInfoPedidos(int id);
    public void EliminarInfoPedidos(int id);

    public List<Pedidos> ConsultarPedidos();
    public Pedidos CrearPedidos(Pedidos pedido);
    public Pedidos ModificarPedidos(Pedidos pedido);
    public Pedidos BuscarPedidos(int id);
    public void EliminarPedidos(int id);

    public List<Productos> ConsultarProductos();
    public Productos CrearProductos(Productos producto);
    public Productos ModificarProductos(Productos producto);
    public Productos BuscarProductos(int id);
    public void EliminarProductos(int id);

    public List<Sesiones> ConsultarSesiones();
    public Sesiones CrearSesiones(Sesiones sesion);
    public Sesiones ModificarSesiones(Sesiones sesion);
    public Sesiones BuscarSesiones(int id);
    public void EliminarSesiones(int id);

    public List<Usuarios> ConsultarUsuarios();
    public Usuarios CrearUsuarios(Usuarios usuario);
    public Usuarios ModificarUsuarios(Usuarios usuario);
    public Usuarios BuscarUsuarios(int id);
    public void EliminarUsuarios(int id);
}
