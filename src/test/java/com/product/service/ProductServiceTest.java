package com.product.service;

import com.product.model.Product;
import com.product.repository.ProductRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceTest {
    @Test
    public void return_product_from_product_id() {
        ProductRepository repository = mock( ProductRepository.class );
        final ProductService service = new ProductService( repository );

        int productId = 1;
        Product product = new Product(1, "Product 1", "Sample description" , "http://example.com");
        when( repository.findOne( productId ) ).thenReturn(product);

        final Product actualProduct = service.getProduct( productId );
        assertEquals( product, actualProduct );
    }
}