package com.dio.projectexpertssession.controller;

import com.dio.projectexpertssession.model.Product;
import com.dio.projectexpertssession.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController<product> {
    
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    ProductRepository create(RequestBody Product ) {
        return productRepository;
        
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Product> findById(@PathVariable Integer id) {

        return productRepository.findById(id);
    }
}
