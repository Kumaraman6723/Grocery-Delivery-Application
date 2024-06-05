package org.ncu.GROCERY.DAO;

import java.util.List;

import org.ncu.GROCERY.ENTITY.Product;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public Product getProductById(int productId) {
        return entityManager.find(Product.class, productId);
    }

    @Override
    @Transactional
    public Product saveOrUpdateProduct(Product product) {
        return entityManager.merge(product);
    }

    @Override
    @Transactional
    public void deleteProduct(int productId) {
        Product product = entityManager.find(Product.class, productId);
        if (product != null) {
            entityManager.remove(product);
        }
    }

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }
}
