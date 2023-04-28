package com.example.PruebaCRUD.Service.ServiceIMPL;

import com.example.PruebaCRUD.Entity.*;
import com.example.PruebaCRUD.Respository.*;
import com.example.PruebaCRUD.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PSIMP implements Services {

    @Autowired
    private CaracteristicasRepo caracteristicasRepo;
    @Autowired
    private CategoriasRepo categoriasRepo;
    @Autowired
    private InfoPedidosRepo infoPedidosRepo;
    @Autowired
    private PedidosRepo pedidosRepo;
    @Autowired
    private ProductosRepo productosRepo;
    @Autowired
    private SesionesRepo sesionesRepo;
    @Autowired
    private UsuariosRepo usuariosRepo;

    //caracteristicas
    @Override
    public List<Caracteristicas> ConsultarCaracteristicas() {
        return (List<Caracteristicas>) this.caracteristicasRepo.findAll();
    }

    @Override
    public Caracteristicas CrearCaracteristicas(Caracteristicas caracteristica) {
        caracteristica.setNombreCaracteristica(caracteristica.getNombreCaracteristica());
        return this.caracteristicasRepo.save(caracteristica);
    }

    @Override
    public Caracteristicas ModificarCaracteristicas(Caracteristicas caracteristica) {
        return this.caracteristicasRepo.save(caracteristica);
    }

    public List<Caracteristicas> BuscarCaracteristicas(Set<Integer> id) {
        List<Caracteristicas> listaPersonas = caracteristicasRepo.getCaracteristicaPorId(id);
        return listaPersonas;
    }

    @Override
    public void EliminarCaracteristicas(int id) {
    this.caracteristicasRepo.deleteById(id);
    }

    //productos

    
}
