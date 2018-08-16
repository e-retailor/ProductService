package com.product.controller;

import com.product.model.Product;
import com.product.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Product getProduct(@RequestParam Integer id) {
        return service.getProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public boolean addProductToStore(@RequestBody Product product) {
        System.out.println("Product : " + product);
        return service.addProduct(product);
    }

}
