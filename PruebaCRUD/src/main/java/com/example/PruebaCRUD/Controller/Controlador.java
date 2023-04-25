package com.example.PruebaCRUD.Controller;

import com.example.PruebaCRUD.Entity.Persona;
import com.example.PruebaCRUD.Service.PersonaServiceIMPL.PSIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class Controlador {

    @Autowired
    private PSIMP impl;

    @GetMapping
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPersonas(){
        List<Persona> listaPersona = this.impl.ConsultarPersona();
        return ResponseEntity.ok(listaPersona);
    }

    @PostMapping
    @RequestMapping(value = "CrearPersonas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPersonas(@RequestBody Persona persona){
        Persona PersonaCreada = this.impl.CrearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaCreada);
    }

    @PutMapping
    @RequestMapping(value = "ModificarPersonas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPersonas(@RequestBody Persona persona){
        Persona PersonaModificada = this.impl.ModificarPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarPersona/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPersona(@PathVariable int id){
        Persona persona = this.impl.BuscarPersona(id);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarPersonas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPersonas(@PathVariable int id){
        this.impl.EliminarPersona(id);
        return ResponseEntity.ok().build();
    }

}
