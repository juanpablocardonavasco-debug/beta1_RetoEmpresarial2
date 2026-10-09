package com.example.beta1_RetoEmpresarial2.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta1_RetoEmpresarial2.models.Reto;

@Repository
public interface IRepositoryReto {

    Reto save(Reto datosReto);

    List<Reto> findAll();

    Optional<Reto> findById(UUID id);

    void deleteById(UUID id);

}