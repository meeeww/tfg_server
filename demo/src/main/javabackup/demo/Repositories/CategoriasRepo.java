package com.example.demo.Repositories;

import com.example.demo.Entities.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepo extends JpaRepository<Categorias, String> {
}
