package com.e_commece.E_Commerce.website.using.SpringBoot.Category;

import jakarta.persistence.*;
import java.util.List;
import com.e_commece.E_Commerce.website.using.SpringBoot.Product.Product;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    // ✅ Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // (Optional) Getters and setters for other fields too if needed
}
