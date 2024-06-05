package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.DAO.StoreDAO;
import org.ncu.GROCERY.ENTITY.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreDAO storeDAO;

    @Override
    @Transactional
    public Store getStoreById(int storeId) {
        return storeDAO.getStoreById(storeId);
    }

    @Override
    @Transactional
    public Store saveOrUpdateStore(Store store) {
        return storeDAO.saveOrUpdateStore(store);
    }

    @Override
    @Transactional
    public void deleteStore(int storeId) {
        storeDAO.deleteStore(storeId);
    }

    @Override
    @Transactional
    public List<Store> getAllStores() {
        return storeDAO.getAllStores();
    }
}

