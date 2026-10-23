package com.example.beta1_RetoEmpresarial2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beta1_RetoEmpresarial2.services.ServicioRegistro;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping ("/api/registro")
public class RegistroControlador {

    @Autowired
    ServicioRegistro servicioRegistro;
    
    //controlador para guardar
    @PostMapping 
    public ResponseEntity<?> guardar(@RequestBody Registro datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar(datos));
    }

    //controlador para buscar
    public ResponseEntity<?> buscar(){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.buscar());
    }


    //controlador para modificar
    @PutMapping("{/id}")
    public ResponseEntity<?> modificar(@PathVariable UUID id, @RequestBody Registro datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.modificar(id, datos));
    }

    //controlador para eliminar
    @DeleteMapping("{/id}")
    public ResponseEntity<?> eliminar(@PathVariable UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.eliminar(id));
    }  
}

