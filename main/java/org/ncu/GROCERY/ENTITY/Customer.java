package org.ncu.GROCERY.ENTITY;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @ElementCollection
    private List<String> deliveryAddresses;

    @ElementCollection
    private List<String> preferredPaymentMethods;

    public Customer() {}

    public Customer(int customerId, User user, List<String> deliveryAddresses, List<String> preferredPaymentMethods) {
        this.customerId = customerId;
        this.user = user;
        this.deliveryAddresses = deliveryAddresses;
        this.preferredPaymentMethods = preferredPaymentMethods;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(List<String> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public List<String> getPreferredPaymentMethods() {
        return preferredPaymentMethods;
    }

    public void setPreferredPaymentMethods(List<String> preferredPaymentMethods) {
        this.preferredPaymentMethods = preferredPaymentMethods;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", user=" + user +
                ", deliveryAddresses=" + deliveryAddresses +
                ", preferredPaymentMethods=" + preferredPaymentMethods +
                '}';
    }
}
