package com.ecommerce.ecommerce.controller;


import com.ecommerce.ecommerce.model.Category;
import com.ecommerce.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class CategoryController {

    private CategoryService categoryService;

    public  CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public List<Category> findAllCategory(){
        return categoryService.findAll();
    }
}
