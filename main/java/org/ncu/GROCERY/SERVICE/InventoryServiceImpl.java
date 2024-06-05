package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.DAO.InventoryDAO;
import org.ncu.GROCERY.ENTITY.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryDAO inventoryDAO;

    @Override
    @Transactional
    public Inventory getInventoryById(int inventoryId) {
        return inventoryDAO.getInventoryById(inventoryId);
    }

    @Override
    @Transactional
    public Inventory saveOrUpdateInventory(Inventory inventory) {
        return inventoryDAO.saveOrUpdateInventory(inventory);
    }

    @Override
    @Transactional
    public void deleteInventory(int inventoryId) {
        inventoryDAO.deleteInventory(inventoryId);
    }

    @Override
    @Transactional
    public List<Inventory> getAllInventories() {
        return inventoryDAO.getAllInventories();
    }
}

