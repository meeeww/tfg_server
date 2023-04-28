package com.example.PruebaCRUD.Service;

import com.example.PruebaCRUD.Entity.*;

import java.util.List;
import java.util.Set;

public interface Services {

    public List<Caracteristicas> ConsultarCaracteristicas();
    public Caracteristicas CrearCaracteristicas(Caracteristicas caracteristica);
    public Caracteristicas ModificarCaracteristicas(Caracteristicas caracteristica);
    public Caracteristicas BuscarCaracteristicas(Set<Integer> id);
    public void EliminarCaracteristicas(int id);
}
