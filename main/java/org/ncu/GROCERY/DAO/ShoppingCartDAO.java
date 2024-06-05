package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.ShoppingCart;

public interface ShoppingCartDAO {
    ShoppingCart getShoppingCartById(int cartId);
    ShoppingCart saveOrUpdateShoppingCart(ShoppingCart cart);
    void deleteShoppingCart(int cartId);
    List<ShoppingCart> getAllShoppingCarts();
}

