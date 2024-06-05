package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Category getCategoryById(int categoryId) {
        return entityManager.find(Category.class, categoryId);
    }

    @Override
    @Transactional
    public Category saveOrUpdateCategory(Category category) {
        return entityManager.merge(category);
    }

    @Override
    @Transactional
    public void deleteCategory(int categoryId) {
        Category category = entityManager.find(Category.class, categoryId);
        if (category != null) {
            entityManager.remove(category);
        }
    }

    @Override
    @Transactional
    public List<Category> getAllCategories() {
        return entityManager.createQuery("SELECT c FROM Category c", Category.class).getResultList();
    }
}

