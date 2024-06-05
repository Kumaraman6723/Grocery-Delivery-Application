package org.ncu.GROCERY.SERVICE;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Inventory;

public interface InventoryService {
    Inventory getInventoryById(int inventoryId);
    Inventory saveOrUpdateInventory(Inventory inventory);
    void deleteInventory(int inventoryId);
    List<Inventory> getAllInventories();
}
