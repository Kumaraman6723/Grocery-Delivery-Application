package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.OrderItem;

public interface OrderItemService {
    OrderItem getOrderItemById(int orderItemId);
    OrderItem saveOrUpdateOrderItem(OrderItem orderItem);
    void deleteOrderItem(int orderItemId);
    List<OrderItem> getAllOrderItems();
}

