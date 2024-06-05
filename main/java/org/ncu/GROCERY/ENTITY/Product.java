package org.ncu.GROCERY.ENTITY;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 200, nullable = false)
    private String description;
    @Column(nullable = false)
    private double price;
    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
    @ElementCollection
    private List<String> promotions;

    public Product() {}

    public Product(String name, String description, double price, Category category, List<String> promotions) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.promotions = promotions;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<String> promotions) {
        this.promotions = promotions;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price=" + price + ", category=" + category + ", promotions=" + promotions + "]";
    }
}