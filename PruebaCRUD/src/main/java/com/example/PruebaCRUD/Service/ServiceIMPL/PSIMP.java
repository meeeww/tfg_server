package com.example.PruebaCRUD.Service.ServiceIMPL;

import com.example.PruebaCRUD.Entity.*;
import com.example.PruebaCRUD.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PSIMP {

    @Autowired
    private CaracteristicasRepo caracteristicasRepo;

    //-----------------------------------------CARACTERISTICAS-----------------------------------------\\
    public List<Caracteristicas> ConsultarCaracteristicas() {
        List<Caracteristicas> listaCaracteristicas = caracteristicasRepo.getCaracteristicas();
        return listaCaracteristicas;
    }

    public List<Caracteristicas> BuscarCaracteristica(Set<Integer> id) {
        List<Caracteristicas> listaCaracteristicas = caracteristicasRepo.getCaracteristicaPorId(id);
        return listaCaracteristicas;
    }
    
    public List<Caracteristicas> CrearCaracteristica(Set<String> nombre) {
        List<Caracteristicas> listaCaracteristicas = caracteristicasRepo.crearCaracteristica(nombre);
        return listaCaracteristicas;
    }

    public List<Caracteristicas> ModificarCaracteristica(Set<Integer> id, Set<String> nombre) {
        List<Caracteristicas> listaCaracteristicas = caracteristicasRepo.modificarCaracteristicaPorId(id, nombre);
        return listaCaracteristicas;
    }

    public List<Caracteristicas> EliminarCaracteristica(Set<Integer> id) {
        List<Caracteristicas> listaCaracteristicas = caracteristicasRepo.eliminarCaracteristicaPorId(id);
        return listaCaracteristicas;
    }

    //productos

    
}
