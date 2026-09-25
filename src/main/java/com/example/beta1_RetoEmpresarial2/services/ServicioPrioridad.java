package com.example.beta1_RetoEmpresarial2.services;

import org.springframework.stereotype.Service;

import com.example.beta1_RetoEmpresarial2.models.Prioridad;

@Service

public class ServicioPrioridad {
    public Prioridad guardarPrioridad(Prioridad datosPrioridad) {
        return datosPrioridad;
    }

}
