package com.ecommerce.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;

    @OneToMany(mappedBy = "category",
    cascade = CascadeType.ALL,
    fetch= FetchType.LAZY)
    private Set<Product> product;

}
