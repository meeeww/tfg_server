package com.example.PruebaCRUD.Service.ServiceIMPL;

import com.example.PruebaCRUD.Entity.Persona;
import com.example.PruebaCRUD.Entity.Producto;
import com.example.PruebaCRUD.Respository.PersonaRepo;
import com.example.PruebaCRUD.Respository.ProductoRepo;
import com.example.PruebaCRUD.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PSIMP implements Services {

    @Autowired
    private PersonaRepo personaRepo;
    @Autowired
    private ProductoRepo productoRepo;

    @Override
    public List<Persona> ConsultarPersona() {
        return (List<Persona>) this.personaRepo.findAll();
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        persona.setEmail(persona.getEmail());
        return this.personaRepo.save(persona);
    }

    @Override
    public Persona ModificarPersona(Persona persona) {
        return this.personaRepo.save(persona);
    }

    @Override
    public Persona BuscarPersona(int id) {
        return this.personaRepo.findById(id).get();
    }

    @Override
    public void EliminarPersona(int id) {
    this.personaRepo.deleteById(id);
    }

    //productos
    @Override
    public List<Producto> ConsultarProducto() {return (List<Producto>) this.productoRepo.findAll();
    }

    @Override
    public Producto CrearProducto(Producto producto) {
        producto.setNombre(producto.getNombre());
        return this.productoRepo.save(producto);
    }

    @Override
    public Producto ModificarProducto(Producto producto) {
        return this.productoRepo.save(producto);
    }

    @Override
    public Producto BuscarProducto(int id) {
        return this.productoRepo.findById(id).get();
    }

    @Override
    public void EliminarProducto(int id) {
        this.productoRepo.deleteById(id);
    }
}
