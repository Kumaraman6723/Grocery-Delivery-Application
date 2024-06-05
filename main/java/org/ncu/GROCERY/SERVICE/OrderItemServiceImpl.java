package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.DAO.OrderItemDAO;
import org.ncu.GROCERY.ENTITY.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemDAO orderItemDAO;

    @Override
    @Transactional
    public OrderItem getOrderItemById(int orderItemId) {
        return orderItemDAO.getOrderItemById(orderItemId);
    }

    @Override
    @Transactional
    public OrderItem saveOrUpdateOrderItem(OrderItem orderItem) {
        return orderItemDAO.saveOrUpdateOrderItem(orderItem);
    }

    @Override
    @Transactional
    public void deleteOrderItem(int orderItemId) {
        orderItemDAO.deleteOrderItem(orderItemId);
    }

    @Override
    @Transactional
    public List<OrderItem> getAllOrderItems() {
        return orderItemDAO.getAllOrderItems();
    }
}
