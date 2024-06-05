package org.ncu.GROCERY.SERVICE;


import java.util.List;

import org.ncu.GROCERY.DAO.CategoryDAO;
import org.ncu.GROCERY.ENTITY.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    @Transactional
    public Category getCategoryById(int categoryId) {
        return categoryDAO.getCategoryById(categoryId);
    }

    @Override
    @Transactional
    public Category saveOrUpdateCategory(Category category) {
        return categoryDAO.saveOrUpdateCategory(category);
    }

    @Override
    @Transactional
    public void deleteCategory(int categoryId) {
        categoryDAO.deleteCategory(categoryId);
    }

    @Override
    @Transactional
    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }
}

