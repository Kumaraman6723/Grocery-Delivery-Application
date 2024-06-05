package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Delivery;

public interface DeliveryDAO {
    Delivery getDeliveryById(int deliveryId);
    Delivery saveOrUpdateDelivery(Delivery delivery);
    void deleteDelivery(int deliveryId);
    List<Delivery> getAllDeliveries();
}

