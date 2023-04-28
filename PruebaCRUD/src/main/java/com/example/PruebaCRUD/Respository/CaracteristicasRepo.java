package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Caracteristicas;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CaracteristicasRepo extends CrudRepository<Caracteristicas, Integer> {
    String getCaracteristicasQuery = "SELECT * FROM caracteristicas WHERE idCaracteristicas = ?1";

    @Query(nativeQuery = true, value = getCaracteristicasQuery)
    List<Caracteristicas> getCaracteristicaPorId(Set<Integer> id);
}
