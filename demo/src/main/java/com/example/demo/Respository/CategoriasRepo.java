package com.example.demo.Respository;

import com.example.demo.Entity.Categorias;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategoriasRepo extends CrudRepository<Categorias, Integer> {
    //consultar
    String getCategoriasQuery = "SELECT * FROM categorias";

    @Query(nativeQuery = true, value = getCategoriasQuery)
    List<Categorias> getCategorias();

    //buscar
    String getCategoriaQuery = "SELECT * FROM categorias WHERE id_categoria = :id";

    @Query(nativeQuery = true, value = getCategoriaQuery)
    List<Categorias> getCategoriaPorId(Set<Integer> id);

    //crear
    String crearCategoriaQuery = "INSERT INTO categorias (nombre_categoria) VALUES (:nombre)";

    @Modifying
    @Query(nativeQuery = true, value = crearCategoriaQuery)
    void crearCategoria(String nombre);

    //modificar
    String modificarCategoriaNombreQuery = "UPDATE categorias SET nombre_categoria = :nombre WHERE categorias.id_categoria = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarCategoriaNombreQuery)
    void modificarCategoriaNombrePorId(Integer id, String nombre);

    //borrar
    String borrarCategoriaQuery = "DELETE FROM categorias WHERE id_categoria = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarCategoriaQuery)
    void eliminarCategoriaPorId(Integer id);
}
