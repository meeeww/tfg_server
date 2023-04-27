package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepo extends CrudRepository<Producto, Integer> {
}
