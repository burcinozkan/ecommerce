package com.ecommerce.ecommerce.controller;


import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/products/category/{categoryId}")
    public List<Product> findByCategory(@PathVariable("categoryId") Long categoryId){
        return productService.findByCategoryId(categoryId);
    }
}
