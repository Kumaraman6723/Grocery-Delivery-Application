package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class ShoppingCartDAOImpl implements ShoppingCartDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public ShoppingCart getShoppingCartById(int cartId) {
        return entityManager.find(ShoppingCart.class, cartId);
    }

    @Override
    @Transactional
    public ShoppingCart saveOrUpdateShoppingCart(ShoppingCart cart) {
        return entityManager.merge(cart);
    }

    @Override
    @Transactional
    public void deleteShoppingCart(int cartId) {
        ShoppingCart cart = entityManager.find(ShoppingCart.class, cartId);
        if (cart != null) {
            entityManager.remove(cart);
        }
    }

    @Override
    @Transactional
    public List<ShoppingCart> getAllShoppingCarts() {
        return entityManager.createQuery("SELECT sc FROM ShoppingCart sc", ShoppingCart.class).getResultList();
    }
}

