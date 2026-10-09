package com.example.beta1_RetoEmpresarial2.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta1_RetoEmpresarial2.models.Empresa;

@Repository
public interface IRepositoryEmpresa {

    Empresa save(Empresa datosEmpresa);

    List<Empresa> findAll();

    Optional<Empresa> findById(UUID id);

    void deleteById(UUID id);

}