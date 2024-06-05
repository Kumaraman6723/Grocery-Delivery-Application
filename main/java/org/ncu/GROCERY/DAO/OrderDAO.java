package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Order;

public interface OrderDAO {
    Order getOrderById(int orderId);
    Order saveOrUpdateOrder(Order order);
    void deleteOrder(int orderId);
    List<Order> getAllOrders();
}

