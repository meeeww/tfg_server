package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Usuarios;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepo extends CrudRepository<Usuarios, Integer> {

    String rawQuery = "SELECT * FROM persona WHERE id = ?1";

    @Query(nativeQuery = true, value = rawQuery)
    List<Usuarios> getPersonaPorYop(Set<Integer> id);
}
