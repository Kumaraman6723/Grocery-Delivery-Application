package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StoreDAOImpl implements StoreDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Store getStoreById(int storeId) {
        return entityManager.find(Store.class, storeId);
    }

    @Override
    @Transactional
    public Store saveOrUpdateStore(Store store) {
        return entityManager.merge(store);
    }

    @Override
    @Transactional
    public void deleteStore(int storeId) {
        Store store = entityManager.find(Store.class, storeId);
        if (store != null) {
            entityManager.remove(store);
        }
    }

    @Override
    @Transactional
    public List<Store> getAllStores() {
        return entityManager.createQuery("SELECT s FROM Store s", Store.class).getResultList();
    }
}
