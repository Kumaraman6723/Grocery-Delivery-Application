package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Store;
import org.ncu.GROCERY.SERVICE.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/post")
    public Store createStore(@RequestBody Store store) {
        return storeService.saveOrUpdateStore(store);
    }

    @GetMapping("/get/{storeId}")
    public Store getStoreById(@PathVariable("storeId") int storeId) {
        return storeService.getStoreById(storeId);
    }

    @PutMapping("/put/{storeId}")
    public Store updateStore(@PathVariable ("storeId") int storeId, @RequestBody Store store) {
        return storeService.saveOrUpdateStore(store);
    }

    @DeleteMapping("/delete/{storeId}")
    public String deleteStore(@PathVariable ("storeId") int storeId) {
        storeService.deleteStore(storeId);
        return "Store with ID " + storeId + " deleted successfully";
    }
}
