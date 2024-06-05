package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class OrderItemDAOImpl implements OrderItemDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public OrderItem getOrderItemById(int orderItemId) {
        return entityManager.find(OrderItem.class, orderItemId);
    }

    @Override
    @Transactional
    public OrderItem saveOrUpdateOrderItem(OrderItem orderItem) {
        return entityManager.merge(orderItem);
    }

    @Override
    @Transactional
    public void deleteOrderItem(int orderItemId) {
        OrderItem orderItem = entityManager.find(OrderItem.class, orderItemId);
        if (orderItem != null) {
            entityManager.remove(orderItem);
        }
    }

    @Override
    @Transactional
    public List<OrderItem> getAllOrderItems() {
        return entityManager.createQuery("SELECT oi FROM OrderItem oi", OrderItem.class).getResultList();
    }
}

