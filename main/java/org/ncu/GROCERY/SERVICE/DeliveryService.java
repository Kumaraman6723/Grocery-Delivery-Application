package org.ncu.GROCERY.SERVICE;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Delivery;

public interface DeliveryService {
    Delivery getDeliveryById(int deliveryId);
    Delivery saveOrUpdateDelivery(Delivery delivery);
    void deleteDelivery(int deliveryId);
    List<Delivery> getAllDeliveries();
}

