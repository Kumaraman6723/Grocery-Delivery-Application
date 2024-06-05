package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.ShoppingCart;
import org.ncu.GROCERY.SERVICE.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shoppingcarts")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @PostMapping("/post")
    public ShoppingCart createShoppingCart(@RequestBody ShoppingCart cart) {
        return shoppingCartService.saveOrUpdateShoppingCart(cart);
    }

    @GetMapping("/get/{cartId}")
    public ShoppingCart getShoppingCartById(@PathVariable("cartId") int cartId) {
        return shoppingCartService.getShoppingCartById(cartId);
    }

    @PutMapping("/put/{cartId}")
    public ShoppingCart updateShoppingCart(@PathVariable ("cartId") int cartId, @RequestBody ShoppingCart cart) {
        return shoppingCartService.saveOrUpdateShoppingCart(cart);
    }

    @DeleteMapping("/delete/{cartId}")
    public String deleteShoppingCart(@PathVariable ("cartId") int cartId) {
        shoppingCartService.deleteShoppingCart(cartId);
        return "ShoppingCart with ID " + cartId + " deleted successfully";
    }
}
