package org.ncu.GROCERY.ENTITY;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "delivery_table")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deliveryId;

    @OneToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

    @Column(length = 20, nullable = false)
    private String status;

    @Column(nullable = false)
    private Date deliveryDateTime;

    public Delivery() {}

    public Delivery(int deliveryId, Order order, String status, Date deliveryDateTime) {
        this.deliveryId = deliveryId;
        this.order = order;
        this.status = status;
        this.deliveryDateTime = deliveryDateTime;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDateTime() {
        return deliveryDateTime;
    }

    public void setDeliveryDateTime(Date deliveryDateTime) {
        this.deliveryDateTime = deliveryDateTime;
    }

    @Override
    public String toString() {
        return "Delivery [deliveryId=" + deliveryId + ", order=" + order + ", status=" + status + ", deliveryDateTime=" + deliveryDateTime + ", orderDetails=" + order.toString() + "]";
    }
}