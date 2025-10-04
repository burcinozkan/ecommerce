package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long productId;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private String imgUrl;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
