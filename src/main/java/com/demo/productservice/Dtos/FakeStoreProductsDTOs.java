package com.demo.productservice.Dtos;

import com.demo.productservice.models.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductsDTOs {
    private long id;

    private String title;

    private String image;

    private String description;

    private String category;

    private double price;


}
