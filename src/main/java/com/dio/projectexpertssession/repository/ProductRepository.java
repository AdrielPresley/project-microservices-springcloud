package com.dio.projectexpertssession.repository;

import com.dio.projectexpertssession.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Integer> {

}
