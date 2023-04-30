package com.example.demo.Respository;

import com.example.demo.Entity.Caracteristicas;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CaracteristicasRepo extends CrudRepository<Caracteristicas, Integer> {
    //consultar
    String getCaracteristicasQuery = "SELECT * FROM caracteristicas";

    @Query(nativeQuery = true, value = getCaracteristicasQuery)
    List<Caracteristicas> getCaracteristicas();

    //buscar
    String getCaracteristicaQuery = "SELECT * FROM caracteristicas WHERE id_caracteristica = :id";

    @Query(nativeQuery = true, value = getCaracteristicaQuery)
    List<Caracteristicas> getCaracteristicaPorId(Set<Integer> id);

    //crear
    String crearCaracteristicaQuery = "INSERT INTO caracteristicas (nombre_caracteristica, valor_caracteristica) VALUES (:nombre, :valor)";

    @Modifying
    @Query(nativeQuery = true, value = crearCaracteristicaQuery)
    void crearCaracteristica(String nombre, String valor);

    //modificar
    String modificarCaracteristicaQuery = "UPDATE caracteristicas SET nombre_caracteristica = :nombre, valor_caracteristica = :valor WHERE caracteristicas.id_caracteristica = :id";
    String modificarCaracteristicaNombreQuery = "UPDATE caracteristicas SET nombre_caracteristica = :nombre WHERE caracteristicas.id_caracteristica = :id";
    String modificarCaracteristicaValorQuery = "UPDATE caracteristicas SET valor_caracteristica = :valor WHERE caracteristicas.id_caracteristica = :id";
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
    String borrarCaracteristicaQuery = "DELETE FROM caracteristicas WHERE id_caracteristica = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarCaracteristicaQuery)
    void eliminarCaracteristicaPorId(Integer id);
}
