package com.example.beta1_RetoEmpresarial2.repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.beta1_RetoEmpresarial2.models.Registro;

@Repository 
public interface IRepositoryRegistro {

    Registro save(Registro datosRegistro);

    List<Registro> findAll();

    Optional<Registro> findById(UUID id);

    void deleteById(UUID id);

}
