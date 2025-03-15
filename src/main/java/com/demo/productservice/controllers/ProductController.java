package com.demo.productservice.controllers;

import com.demo.productservice.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.productservice.services.ProductService;

@RestController
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PutMapping("/products")
    public void CreateProduct(){

    }
    @GetMapping("/products")
    public void GetAllProducts(){

    }
    @GetMapping("/products/{id}")
    public Product GetProductById(@PathVariable("id") long id){
        return productService.GetOneProductById(id);
    }
//    @GetMapping("/products/{id}")
//    public void DeleteProductById(int id){
//
//    }
}
