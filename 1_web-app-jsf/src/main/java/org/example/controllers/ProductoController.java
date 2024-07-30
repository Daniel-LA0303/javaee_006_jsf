package org.example.controllers;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Model;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.entities.Producto;
import org.example.service.ProductoService;

import java.util.Arrays;
import java.util.List;

@Model
public class ProductoController {

    @Inject
    private ProductoService productoService;


    @Produces
    @Model
    public String titulo(){
        return "Productos";
    }


    @Produces
    @Named("listado")
    @RequestScoped
    public List<Producto> productos(){
        /*return Arrays.asList(new Producto("peras"),
                new Producto("manzanas"),
                new Producto("naranjas"));*/

        return productoService.findAll();
    }
}
