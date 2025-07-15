package com.e_commece.E_Commerce.website.using.SpringBoot.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // ✅ Get all categories
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // ✅ Get category by ID
    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    // ✅ Load default e-commerce categories into DB (POST method for safety)
    @PostMapping("/load-default")
    public String loadDefaultCategories() {
        List<String> categoryNames = Arrays.asList(
            "Clothing", "Shoes", "Accessories", "Electronics", "Mobiles", "Laptops",
            "Home Appliances", "Furniture", "Books", "Beauty Products", "Watches",
            "Sports & Fitness", "Groceries", "Toys", "Bags", "Cameras", "Headphones",
            "Jewelry", "Kitchenware", "Gaming"
        );

        for (String name : categoryNames) {
            Category category = new Category();
            category.setName(name);
            categoryService.saveCategory(category);
        }

        return "✅ Default categories loaded successfully!";
    }
}
