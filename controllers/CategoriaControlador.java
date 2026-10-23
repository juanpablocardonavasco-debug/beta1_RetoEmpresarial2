package com.example.beta1_RetoEmpresarial2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.beta1_RetoEmpresarial2.services.ServicioCategoria;
import org.springframework.web.bind.annotation.PutMapping;

@RestController 
@RequestMapping("/api/categoria")
public class CategoriaControlador {

    @Autowired 
     ServicioCategoria servicioCategoria;

    // Controlador para guardar
    @PostMapping 
    public ResponseEntity<?> guardar(@RequestBody Categoria datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar(datos));
    }

    // Controlador para buscar / listar todos
    
    public ResponseEntity<?> buscar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar());
    }

    // Controlador para modificar
    @PutMapping("{/id}")
    public ResponseEntity<?> modificar(@PathVariable UUID id, @RequestBody Categoria datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar(id, datos));
    }

    // Controlador para eliminar
    @DelateMapping("{/id}")
    
    public ResponseEntity<?> eliminar(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar(id));
    }

}
