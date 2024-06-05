package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Delivery;
import org.ncu.GROCERY.SERVICE.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/post")
    public Delivery createDelivery(@RequestBody Delivery delivery) {
        return deliveryService.saveOrUpdateDelivery(delivery);
    }

    @GetMapping("/get/{deliveryId}")
    public Delivery getDeliveryById(@PathVariable("deliveryId") int deliveryId) {
        return deliveryService.getDeliveryById(deliveryId);
    }

    @PutMapping("/put/{deliveryId}")
    public Delivery updateDelivery(@PathVariable ("deliveryId") int deliveryId, @RequestBody Delivery delivery) {
        return deliveryService.saveOrUpdateDelivery(delivery);
    }

    @DeleteMapping("/delete/{deliveryId}")
    public String deleteDelivery(@PathVariable  ("deliveryId") int deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
        return "Delivery with ID " + deliveryId + " deleted successfully";
    }
}
