package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Inventory;

public interface InventoryDAO {
    Inventory getInventoryById(int inventoryId);
    Inventory saveOrUpdateInventory(Inventory inventory);
    void deleteInventory(int inventoryId);
    List<Inventory> getAllInventories();
}

