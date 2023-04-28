package com.example.PruebaCRUD.Controller;

import com.example.PruebaCRUD.Entity.Usuarios;
import com.example.PruebaCRUD.Entity.Productos;
import com.example.PruebaCRUD.Service.ServiceIMPL.PSIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("API")
public class Controlador {

    @Autowired
    private PSIMP impl;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){
        List<Usuarios> listaPersona = this.impl.ConsultarPersona();
        return ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value = "CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersonas(@RequestBody Usuarios persona){
        Usuarios PersonaCreada = this.impl.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Usuarios persona){
        Usuarios PersonaModificada = this.impl.ModificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Usuarios persona = this.impl.BuscarPersona(id);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersonas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersonas(@PathVariable int id){
        this.impl.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/raw/personas")
    public List<Usuarios> conseguirPersonaQuery( @RequestParam(value = "id") Set<Integer> yop){
        return impl.BuscarPersonaQuery(yop);
    }

    @GetMapping
    @RequestMapping(value = "ConsultarProductos", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProductos(){
        List<Productos> listaProducto = this.impl.ConsultarProducto();
        return ResponseEntity.ok(listaProducto);
    }

}
