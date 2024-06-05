package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.DAO.DeliveryDAO;
import org.ncu.GROCERY.ENTITY.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class DeliveryServiceImpl implements DeliveryService {

    @Autowired
    private DeliveryDAO deliveryDAO;

    @Override
    @Transactional
    public Delivery getDeliveryById(int deliveryId) {
        return deliveryDAO.getDeliveryById(deliveryId);
    }

    @Override
    @Transactional
    public Delivery saveOrUpdateDelivery(Delivery delivery) {
        return deliveryDAO.saveOrUpdateDelivery(delivery);
    }

    @Override
    @Transactional
    public void deleteDelivery(int deliveryId) {
        deliveryDAO.deleteDelivery(deliveryId);
    }

    @Override
    @Transactional
    public List<Delivery> getAllDeliveries() {
        return deliveryDAO.getAllDeliveries();
    }
}
