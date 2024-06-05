package org.ncu.GROCERY.ENTITY;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory_table")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventoryId;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "storeId", nullable = false)
    private Store store;

    public Inventory() {}

    public Inventory(int inventoryId, int quantity, Store store) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
        this.store = store;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Store getStore() {
        return store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "Inventory [inventoryId=" + inventoryId + ", quantity=" + quantity + ", store=" + store + "]";
    }
}