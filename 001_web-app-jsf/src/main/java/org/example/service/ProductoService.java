package org.example.service;

import jakarta.ejb.Local;
import org.example.entities.Producto;

import java.util.List;
import java.util.Optional;

@Local
public interface ProductoService {

    List<Producto> findAll();

    Optional<Producto> findById(Long id);
}
