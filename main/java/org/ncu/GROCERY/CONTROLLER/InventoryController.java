package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Inventory;
import org.ncu.GROCERY.SERVICE.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/post")
    public Inventory createInventory(@RequestBody Inventory inventory) {
        return inventoryService.saveOrUpdateInventory(inventory);
    }

    @GetMapping("/get/{inventoryId}")
    public Inventory getInventoryById(@PathVariable("inventoryId") int inventoryId) {
        return inventoryService.getInventoryById(inventoryId);
    }

    @PutMapping("/put/{inventoryId}")
    public Inventory updateInventory(@PathVariable ("inventoryId") int inventoryId, @RequestBody Inventory inventory) {
        return inventoryService.saveOrUpdateInventory(inventory);
    }

    @DeleteMapping("/delete/{inventoryId}")
    public String deleteInventory(@PathVariable ("inventoryId") int inventoryId) {
        inventoryService.deleteInventory(inventoryId);
        return "Inventory with ID " + inventoryId + " deleted successfully";
    }
}
