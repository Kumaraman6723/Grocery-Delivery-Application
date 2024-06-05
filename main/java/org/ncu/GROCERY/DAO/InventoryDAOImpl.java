package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class InventoryDAOImpl implements InventoryDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Inventory getInventoryById(int inventoryId) {
        return entityManager.find(Inventory.class, inventoryId);
    }

    @Override
    @Transactional
    public Inventory saveOrUpdateInventory(Inventory inventory) {
        return entityManager.merge(inventory);
    }

    @Override
    @Transactional
    public void deleteInventory(int inventoryId) {
        Inventory inventory = entityManager.find(Inventory.class, inventoryId);
        if (inventory != null) {
            entityManager.remove(inventory);
        }
    }

    @Override
    @Transactional
    public List<Inventory> getAllInventories() {
        return entityManager.createQuery("SELECT i FROM Inventory i", Inventory.class).getResultList();
    }
}

