package com.pump.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "orders")
@Entity
public class Order {
    private @Id @GeneratedValue long id;
    private int userID;
    private int paymentID;
    private String orderStatus;
    private LocalDate orderDate;


    public Order() {
    }

    public Order(int userID, int paymentID ,String orderStatus, LocalDate orderDate) {
        this.userID = userID;
        this.paymentID = paymentID;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
