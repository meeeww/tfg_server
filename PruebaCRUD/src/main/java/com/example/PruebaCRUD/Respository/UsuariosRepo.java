package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Usuarios;

import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepo extends CrudRepository<Usuarios, Integer> {
}
