package com.e_commece.E_Commerce.website.using.SpringBoot.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryWebController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "categories"; // This must match categories.html
    }
}
