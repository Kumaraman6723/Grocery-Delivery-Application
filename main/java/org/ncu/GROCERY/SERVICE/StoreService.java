package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Store;

public interface StoreService {
    Store getStoreById(int storeId);
    Store saveOrUpdateStore(Store store);
    void deleteStore(int storeId);
    List<Store> getAllStores();
}
