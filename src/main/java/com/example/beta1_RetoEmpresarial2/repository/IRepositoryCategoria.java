package com.example.beta1_RetoEmpresarial2.repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta1_RetoEmpresarial2.models.Categoria;

@Repository 
public interface IRepositoryCategoria {

    Categoria save(Categoria datosCategoria);

    List<Categoria> findAll();

    Optional<Categoria> findById(UUID id);

    void deleteById(UUID id);

}