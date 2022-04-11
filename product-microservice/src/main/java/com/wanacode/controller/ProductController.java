package com.wanacode.controller;

import com.wanacode.entity.ProductEntity;
import com.wanacode.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> listarProductos() {
        return productRepository.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void guardarProducto(@RequestBody ProductEntity productEntity) {
        productRepository.save(productEntity);

    }
}
