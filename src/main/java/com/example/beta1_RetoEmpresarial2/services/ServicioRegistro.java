package com.example.beta1_RetoEmpresarial2.services;

import org.springframework.stereotype.Service;

import com.example.beta1_RetoEmpresarial2.models.Registro;

@Service

public class ServicioRegistro {
    public Registro guardarRegistro(Registro datosRegistro) {
        return datosRegistro;
    }

}