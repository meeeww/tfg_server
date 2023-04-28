package com.example.PruebaCRUD.Respository;

import com.example.PruebaCRUD.Entity.Pedidos;
import org.springframework.data.repository.CrudRepository;

public interface PedidosRepo extends CrudRepository<Pedidos, Integer> {
}
