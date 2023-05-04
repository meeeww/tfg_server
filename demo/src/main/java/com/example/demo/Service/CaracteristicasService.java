package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CaracteristicasService {

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
    
    public void CrearCaracteristica(String nombre, String valor) {
        caracteristicasRepo.crearCaracteristica(nombre, valor);
    }

    public void ModificarCaracteristica(Integer id, String nombre, String valor) {
        caracteristicasRepo.modificarCaracteristicaPorId(id, nombre, valor);
    }

    public void ModificarCaracteristicaNombre(Integer id, String nombre) {
        caracteristicasRepo.modificarCaracteristicaNombrePorId(id, nombre);
    }

    public void ModificarCaracteristicaValor(Integer id, String valor) {
        caracteristicasRepo.modificarCaracteristicaValorPorId(id, valor);
    }

    public void EliminarCaracteristica(Integer id) {
        caracteristicasRepo.eliminarCaracteristicaPorId(id);
    }
}
