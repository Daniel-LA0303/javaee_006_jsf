package org.example.service;


import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import org.example.entities.Producto;
import org.example.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Stateless
public class ProductoServiceImpl implements ProductoService{

    @Inject
    private CrudRepository<Producto> repository;

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
      try {
        return Optional.ofNullable(repository.findById(id));
      } catch (Exception e) {
        return Optional.empty();
      }
    }
}
