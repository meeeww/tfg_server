package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Caracteristicas;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CaracteristicasRepo extends CrudRepository<Caracteristicas, Integer> {
    //consultar
    String getCaracteristicasQuery = "SELECT * FROM caracteristicas;";

    @Query(nativeQuery = true, value = getCaracteristicasQuery)
    List<Caracteristicas> getCaracteristicas();

    //buscar
    String getCaracteristicaQuery = "SELECT * FROM caracteristicas WHERE id_caracteristicas = ?1";

    @Query(nativeQuery = true, value = getCaracteristicaQuery)
    List<Caracteristicas> getCaracteristicaPorId(Set<Integer> id);

    //crear
    String crearCaracteristicaQuery = "INSERT INTO `caracteristicas` (`id_caracteristicas`, `nombre_caracteristica`) VALUES (NULL, ?1)";

    @Query(nativeQuery = true, value = crearCaracteristicaQuery)
    List<Caracteristicas> crearCaracteristica(Set<String> nombre);

    //modificar
    String modificarCaracteristicaQuery = "UPDATE `caracteristicas` SET `nombre_caracteristica` = ?1 WHERE `caracteristicas`.`id_caracteristicas` = ?2";

    @Query(nativeQuery = true, value = modificarCaracteristicaQuery)
    List<Caracteristicas> modificarCaracteristicaPorId(Set<Integer> id, Set<String> nombre);

    //borrar
    String borrarCaracteristicaQuery = "DELETE FROM caracteristicas WHERE id_caracteristicas = ?1";

    @Query(nativeQuery = true, value = borrarCaracteristicaQuery)
    List<Caracteristicas> eliminarCaracteristicaPorId(Set<Integer> id);
}
