package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Category;

public interface CategoryDAO {
    Category getCategoryById(int categoryId);
    Category saveOrUpdateCategory(Category category);
    void deleteCategory(int categoryId);
    List<Category> getAllCategories();
}

