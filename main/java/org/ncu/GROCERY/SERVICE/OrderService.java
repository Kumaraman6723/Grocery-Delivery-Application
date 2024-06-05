package org.ncu.GROCERY.SERVICE;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Order;

public interface OrderService {
    Order getOrderById(int orderId);
    Order saveOrUpdateOrder(Order order);
    void deleteOrder(int orderId);
    List<Order> getAllOrders();
}

