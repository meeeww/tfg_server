package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ContactosService {

    @Autowired
    private ContactosRepo contactosRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Contactos> ConsultarContactos() {
        List<Contactos> listaContactos = contactosRepo.getContactos();
        return listaContactos;
    }

    public List<Contactos> BuscarContactoPorId(Set<Integer> id) {
        List<Contactos> listaContactos = contactosRepo.getContactoPorId(id);
        return listaContactos;
    }

    public void CrearContacto(String nombre, String email, String telefono, String mensaje) {
        contactosRepo.crearContacto(nombre, email, telefono, mensaje);
    }

    public void ModificarTrabajoIdUsuario(Integer id, String nombre) {
        contactosRepo.modificarContactoNombrePorId(id, nombre);
    }

    public void ModificarContactoEmailPorId(Integer id, String email) {
        contactosRepo.modificarContactoEmailPorId(id, email);
    }

    public void ModificarContactoTelefonoPorId(Integer id, String telefono){
        contactosRepo.modificarContactoTelefonoPorId(id, telefono);
    }

    public void ModificarContactoMensajePorId(Integer id, String mensaje){
        contactosRepo.modificarContactoMensajePorId(id, mensaje);
    }

    public void EliminarContacto(Integer id) {
        contactosRepo.eliminarContactoPorId(id);
    }
    
}
