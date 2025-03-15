package com.demo.productservice.services;

import com.demo.productservice.Dtos.FakeStoreProductsDTOs;
import com.demo.productservice.models.Category;
import com.demo.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service 
public class FakeStoreProductService implements ProductService{
    @Override
    public Product GetOneProductById(long id) {
        RestTemplate restTemplate = new RestTemplate();

        FakeStoreProductsDTOs fakeStoreProductsDTOs = restTemplate
                .getForObject(
                        "https://fakestoreapi.com/products/"+id,
                        FakeStoreProductsDTOs.class
                );
        Product product = new Product();
        product.setId(fakeStoreProductsDTOs.getId());
        product.setTitle(fakeStoreProductsDTOs.getTitle());
        product.setPrice(fakeStoreProductsDTOs.getPrice());
        product.setDescription(fakeStoreProductsDTOs.getDescription());

        Category category = new Category();
        category.setTitle(fakeStoreProductsDTOs.getCategory());
        product.setCategory(category);

        return product;
    }
}
