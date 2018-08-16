package com.product.repository;

import com.product.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Override
    Product findOne(Integer id);

    @Override <S extends Product> S save(S entity );
}
