package org.ncu.GROCERY.ENTITY;

import jakarta.persistence.*;

@Entity
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cartId", nullable = false)
    private ShoppingCart shoppingCart;

    @Column(nullable = false)
    private double totalAmount;

    public Order() {}

    public Order(int orderId, Customer customer, ShoppingCart shoppingCart, double totalAmount) {
        this.orderId = orderId;
        this.customer = customer;
        this.shoppingCart = shoppingCart;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer.getCustomerId() +
                ", shoppingCart=" + shoppingCart +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
