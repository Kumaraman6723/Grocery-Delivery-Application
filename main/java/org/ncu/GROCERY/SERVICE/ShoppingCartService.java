package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart getShoppingCartById(int cartId);
    ShoppingCart saveOrUpdateShoppingCart(ShoppingCart cart);
    void deleteShoppingCart(int cartId);
    List<ShoppingCart> getAllShoppingCarts();
}
