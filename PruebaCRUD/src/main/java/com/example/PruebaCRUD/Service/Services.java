package com.example.PruebaCRUD.Service;

import com.example.PruebaCRUD.Entity.Persona;
import com.example.PruebaCRUD.Entity.Producto;

import java.util.List;

public interface Services {

    public List<Persona> ConsultarPersona();
    public Persona CrearPersona(Persona persona);
    public Persona ModificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminarPersona(int id);

    public List<Producto> ConsultarProducto();
    public Producto CrearProducto(Producto producto);
    public Producto ModificarProducto(Producto producto);
    public Producto BuscarProducto(int id);
    public void EliminarProducto(int id);

}
