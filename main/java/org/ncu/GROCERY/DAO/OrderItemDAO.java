package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.OrderItem;

public interface OrderItemDAO {
    OrderItem getOrderItemById(int orderItemId);
    OrderItem saveOrUpdateOrderItem(OrderItem orderItem);
    void deleteOrderItem(int orderItemId);
    List<OrderItem> getAllOrderItems();
}

