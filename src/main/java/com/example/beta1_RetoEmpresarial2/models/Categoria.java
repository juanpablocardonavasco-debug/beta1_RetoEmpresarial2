package com.example.beta1_RetoEmpresarial2.models;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
 @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nombre", nullable = false, unique = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false, unique = false, length = 200)
    private String descripcion;

    @OneToMany(mappedBy = "categoria")
    @JsonManagedReference
    private List<Reto> retos = new ArrayList<>();

    public Categoria() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object descripcion) {
        this.descripcion = (String) descripcion;
    }

    public List<Reto> getRetos() {
        return retos;
    }

    public void setRetos(List<Reto> retos) {
        this.retos = retos;
    }

    public Object getNivel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNivel'");
    }

    public void setNivel(Object nivel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


