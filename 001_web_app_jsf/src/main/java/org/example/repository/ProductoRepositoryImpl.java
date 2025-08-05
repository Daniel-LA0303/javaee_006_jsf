package org.example.repository;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.example.entities.Producto;

import java.util.List;

@RequestScoped
public class ProductoRepositoryImpl implements CrudRepository<Producto>{

    @Inject
    private EntityManager em;


    @Override
    public List<Producto> findAll() {
        return em.createQuery("from Producto", Producto.class).getResultList();

    }

    @Override
    public Producto findById(Long id) {
        return em.find(Producto.class, id);
    }
}
