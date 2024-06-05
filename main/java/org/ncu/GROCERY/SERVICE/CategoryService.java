package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Category;

public interface CategoryService {
    Category getCategoryById(int categoryId);
    Category saveOrUpdateCategory(Category category);
    void deleteCategory(int categoryId);
    List<Category> getAllCategories();
}

