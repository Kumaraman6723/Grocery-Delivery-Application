package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class DeliveryDAOImpl implements DeliveryDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Delivery getDeliveryById(int deliveryId) {
        return entityManager.find(Delivery.class, deliveryId);
    }

    @Override
    @Transactional
    public Delivery saveOrUpdateDelivery(Delivery delivery) {
        return entityManager.merge(delivery);
    }

    @Override
    @Transactional
    public void deleteDelivery(int deliveryId) {
        Delivery delivery = entityManager.find(Delivery.class, deliveryId);
        if (delivery != null) {
            entityManager.remove(delivery);
        }
    }

    @Override
    @Transactional
    public List<Delivery> getAllDeliveries() {
        return entityManager.createQuery("SELECT d FROM Delivery d", Delivery.class).getResultList();
    }
}

