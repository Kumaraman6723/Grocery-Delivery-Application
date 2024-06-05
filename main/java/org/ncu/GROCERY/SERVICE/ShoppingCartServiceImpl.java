package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.DAO.ShoppingCartDAO;
import org.ncu.GROCERY.ENTITY.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartDAO shoppingCartDAO;

    @Override
    @Transactional
    public ShoppingCart getShoppingCartById(int cartId) {
        return shoppingCartDAO.getShoppingCartById(cartId);
    }

    @Override
    @Transactional
    public ShoppingCart saveOrUpdateShoppingCart(ShoppingCart cart) {
        return shoppingCartDAO.saveOrUpdateShoppingCart(cart);
    }

    @Override
    @Transactional
    public void deleteShoppingCart(int cartId) {
        shoppingCartDAO.deleteShoppingCart(cartId);
    }

    @Override
    @Transactional
    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartDAO.getAllShoppingCarts();
    }
}

