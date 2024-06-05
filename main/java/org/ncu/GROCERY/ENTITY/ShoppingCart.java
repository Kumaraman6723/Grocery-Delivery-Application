package org.ncu.GROCERY.ENTITY;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cart_id")
    private Set<OrderItem> cartItems = new HashSet<>();

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public Set<OrderItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Set<OrderItem> cartItems) {
        this.cartItems = cartItems;
    }

    public void addCartItem(OrderItem orderItem) {
        this.cartItems.add(orderItem);
    }

    public void removeCartItem(OrderItem orderItem) {
        this.cartItems.remove(orderItem);
    }

    @Override
    public String toString() {
        return "ShoppingCart [cartId=" + cartId + ", cartItems=" + cartItems + "]";
    }
}
