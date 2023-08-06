package com.montec.msvc.articulo.services;

import com.montec.msvc.articulo.dao.ArticuloDao;
import com.montec.msvc.articulo.entities.Articulo;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class ArticuloServiceImpl implements IArticuloService{

    private ArticuloDao articuloDao;

    public ArticuloServiceImpl(ArticuloDao articuloDao){
        this.articuloDao = articuloDao;
    }
    @Override
    public ResponseEntity<Optional<Articulo>> getById(Long id) {
        if(articuloDao.findById(id).isPresent()){
            return ResponseEntity.ok().body(articuloDao.findById(id));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public Articulo create(Articulo articulo) {
        return articuloDao.save(articulo);
    }

    @Override
    public List<Articulo> getAll() {
        return articuloDao.findAll();
    }
}
