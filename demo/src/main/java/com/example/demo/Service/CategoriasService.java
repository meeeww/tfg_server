package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CategoriasService {

    @Autowired
    private CategoriasRepo categoriasRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Categorias> ConsultarCategorias() {
        List<Categorias> listaCategorias = categoriasRepo.getCategorias();
        return listaCategorias;
    }

    public List<Categorias> BuscarCategoria(Set<Integer> id) {
        List<Categorias> listaCategoria = categoriasRepo.getCategoriaPorId(id);
        return listaCategoria;
    }
    
    public void CrearCategoria(String nombre) {
        categoriasRepo.crearCategoria(nombre);
    }

    public void ModificarCategoriaValor(Integer id, String nombre) {
        categoriasRepo.modificarCategoriaNombrePorId(id, nombre);
    }

    public void EliminarCategoria(Integer id) {
        categoriasRepo.eliminarCategoriaPorId(id);
    }
}
