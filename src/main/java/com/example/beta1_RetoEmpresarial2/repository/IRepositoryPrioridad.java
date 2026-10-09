package com.example.beta1_RetoEmpresarial2.repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta1_RetoEmpresarial2.models.Prioridad;
import com.example.beta1_RetoEmpresarial2.models.Reto;

@Repository
public interface IRepositoryPrioridad{

    Prioridad save(Prioridad datosPrioridad);

    List <Prioridad> findAll();
    Optional <Prioridad> findById(UUID id);
    void deleteById(UUID id);

    Reto save(Reto datosReto);

}
