package com.TrabajoFinal.TF.service;

import com.TrabajoFinal.TF.entity.Producto;

import java.util.List;

public interface ProductoService {
    Producto save(Producto producto);
    List<Producto> findAll();
}
