package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Caracteristicas;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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
    String crearCaracteristicaQuery = "INSERT INTO `caracteristicas` (`id_caracteristicas`, `nombre_caracteristica`, `valor_caracteristica`) VALUES (NULL, ?1, ?2)";

    @Modifying
    @Query(nativeQuery = true, value = crearCaracteristicaQuery)
    void crearCaracteristica(String nombre, String valor);

    //modificar
    String modificarCaracteristicaQuery = "UPDATE `caracteristicas` SET `nombre_caracteristica` = ?2, `valor_caracteristica` = ?3 WHERE `caracteristicas`.`id_caracteristicas` = ?1";
    String modificarCaracteristicaNombreQuery = "UPDATE `caracteristicas` SET `nombre_caracteristica` = ?2 WHERE `caracteristicas`.`id_caracteristicas` = ?1";
    String modificarCaracteristicaValorQuery = "UPDATE `caracteristicas` SET `valor_caracteristica` = ?2 WHERE `caracteristicas`.`id_caracteristicas` = ?1";
    @Modifying
    @Query(nativeQuery = true, value = modificarCaracteristicaQuery)
    void modificarCaracteristicaPorId(Integer id, String nombre, String valor);

    @Modifying
    @Query(nativeQuery = true, value = modificarCaracteristicaNombreQuery)
    void modificarCaracteristicaNombrePorId(Integer id, String nombre);

    @Modifying
    @Query(nativeQuery = true, value = modificarCaracteristicaValorQuery)
    void modificarCaracteristicaValorPorId(Integer id, String valor);

    //borrar
    String borrarCaracteristicaQuery = "DELETE FROM caracteristicas WHERE id_caracteristicas = ?1";

    @Modifying
    @Query(nativeQuery = true, value = borrarCaracteristicaQuery)
    void eliminarCaracteristicaPorId(Integer id);
}
