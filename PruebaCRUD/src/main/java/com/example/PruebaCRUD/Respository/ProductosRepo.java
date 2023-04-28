package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface ProductosRepo extends CrudRepository<Productos, Integer> {
}
