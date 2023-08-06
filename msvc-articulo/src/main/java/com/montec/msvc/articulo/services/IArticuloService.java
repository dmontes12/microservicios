package com.montec.msvc.articulo.services;

import com.montec.msvc.articulo.entities.Articulo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IArticuloService {
    public ResponseEntity<Optional<Articulo>> getById(Long id);
    public Articulo create(Articulo articulo);
    public List<Articulo> getAll();
}
