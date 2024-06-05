package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.OrderItem;
import org.ncu.GROCERY.SERVICE.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderitems")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PostMapping("/post")
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.saveOrUpdateOrderItem(orderItem);
    }

    @GetMapping("/get/{orderItemId}")
    public OrderItem getOrderItemById(@PathVariable("orderItemId") int orderItemId) {
        return orderItemService.getOrderItemById(orderItemId);
    }

    @PutMapping("/put/{orderItemId}")
    public OrderItem updateOrderItem(@PathVariable ("orderItemId") int orderItemId, @RequestBody OrderItem orderItem) {
        return orderItemService.saveOrUpdateOrderItem(orderItem);
    }

    @DeleteMapping("/delete/{orderItemId}")
    public String deleteOrderItem(@PathVariable ("orderItemId") int orderItemId) {
        orderItemService.deleteOrderItem(orderItemId);
        return "OrderItem with ID " + orderItemId + " deleted successfully";
    }
}
