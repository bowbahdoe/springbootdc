package com.pump.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderedProduct {
    @Id
    @GeneratedValue
    private long id;
    private long productID;
    private long orderID;
    private int quantity;

    public OrderedProduct(long productID, long orderID, int quantity) {
        this.productID = productID;
        this.orderID = orderID;
        this.quantity = quantity;
    }

    public OrderedProduct() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
