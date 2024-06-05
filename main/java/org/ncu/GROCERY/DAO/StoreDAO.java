package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Store;

public interface StoreDAO {
    Store getStoreById(int storeId);
    Store saveOrUpdateStore(Store store);
    void deleteStore(int storeId);
    List<Store> getAllStores();
}

