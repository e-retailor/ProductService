package com.product.service;

import com.product.model.Product;
import com.product.repository.ProductRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProductService {
    private ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository ) {
        this.repository = repository;
    }

    public Product getProduct(final int id ) {
        final Product product = repository.findOne( id );
        if ( product == null ) {
            throw new ServiceException("Invalid product id");
        }
        return product;
    }

    public void addProduct(final Product product) {
        repository.save(product);
    }
}
