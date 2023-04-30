package com.example.demo;

import com.example.demo.Entities.Categorias;
import com.example.demo.Repositories.CategoriasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@Autowired
	CategoriasRepo repo;

	@GetMapping("/test")
	public String test(){
		Categorias categoria = new Categorias("Zas");
		repo.save(categoria);

		return repo.findAll().stream().findFirst().toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
