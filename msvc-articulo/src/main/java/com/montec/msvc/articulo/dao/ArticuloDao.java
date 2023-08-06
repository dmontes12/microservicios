package com.montec.msvc.articulo.dao;

import com.montec.msvc.articulo.entities.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloDao extends JpaRepository<Articulo, Long> {
}
