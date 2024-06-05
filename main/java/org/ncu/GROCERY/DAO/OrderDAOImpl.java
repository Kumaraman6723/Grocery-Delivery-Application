package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Order getOrderById(int orderId) {
        return entityManager.find(Order.class, orderId);
    }

    @Override
    @Transactional
    public Order saveOrUpdateOrder(Order order) {
        return entityManager.merge(order);
    }

    @Override
    @Transactional
    public void deleteOrder(int orderId) {
        Order order = entityManager.find(Order.class, orderId);
        if (order != null) {
            entityManager.remove(order);
        }
    }

    @Override
    @Transactional
    public List<Order> getAllOrders() {
        return entityManager.createQuery("SELECT o FROM Order o", Order.class).getResultList();
    }
}

