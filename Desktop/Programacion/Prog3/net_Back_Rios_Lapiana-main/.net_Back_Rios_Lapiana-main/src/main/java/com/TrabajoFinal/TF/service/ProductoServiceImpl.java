package com.TrabajoFinal.TF.service;

import com.TrabajoFinal.TF.entity.Producto;
import com.TrabajoFinal.TF.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    private final ProductoRepository productoRepository;
    @Autowired
    public ProductoServiceImpl(ProductoRepository productoRepository){
        this.productoRepository=productoRepository;
    }
    @Override
    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }
    @Override
    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

}
