package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Category;
import org.ncu.GROCERY.SERVICE.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/post")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveOrUpdateCategory(category);
    }

    @GetMapping("/get/{categoryId}")
    public Category getCategoryById(@PathVariable("categoryId") int categoryId) {
        return categoryService.getCategoryById(categoryId);
    }

    @PutMapping("/put/{categoryId}")
    public Category updateCategory(@PathVariable  int categoryId, @RequestBody Category category) {
        category.setCategoryId(categoryId);
        return categoryService.saveOrUpdateCategory(category);
    }

    @DeleteMapping("/delete/{categoryId}")
    public String deleteCategory(@PathVariable int categoryId) {
        categoryService.deleteCategory(categoryId);
        return "Category with ID " + categoryId + " deleted successfully";
    }
}
