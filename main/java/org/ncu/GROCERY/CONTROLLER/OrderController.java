package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Order;
import org.ncu.GROCERY.SERVICE.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/post")
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrUpdateOrder(order);
    }

    @GetMapping("/get/{orderId}")
    public Order getOrderById(@PathVariable("orderId") int orderId) {
        return orderService.getOrderById(orderId);
    }

    @PutMapping("/put/{orderId}")
    public Order updateOrder(@PathVariable ("orderId")  int orderId, @RequestBody Order order) {
        return orderService.saveOrUpdateOrder(order);
    }

    @DeleteMapping("/delete/{orderId}")
    public String deleteOrder(@PathVariable ("orderId")  int orderId) {
        orderService.deleteOrder(orderId);
        return "Order with ID " + orderId + " deleted successfully";
    }
}
