package org.ncu.GROCERY.SERVICE;


import java.util.List;

import org.ncu.GROCERY.DAO.OrderDAO;
import org.ncu.GROCERY.ENTITY.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    @Transactional
    public Order getOrderById(int orderId) {
        return orderDAO.getOrderById(orderId);
    }

    @Override
    @Transactional
    public Order saveOrUpdateOrder(Order order) {
        return orderDAO.saveOrUpdateOrder(order);
    }

    @Override
    @Transactional
    public void deleteOrder(int orderId) {
        orderDAO.deleteOrder(orderId);
    }

    @Override
    @Transactional
    public List<Order> getAllOrders() {
        return orderDAO.getAllOrders();
    }
}

