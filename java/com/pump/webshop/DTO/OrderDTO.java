package com.pump.webshop.DTO;

import java.time.LocalDate;

public class OrderDTO {
    public int userID;
    public int paymentID;
    public String orderStatus;
    public LocalDate date;

    public OrderDTO(int userID, int paymentID, String orderStatus, LocalDate date) {
        this.userID = userID;
        this.paymentID = paymentID;
        this.orderStatus = orderStatus;
        this.date = date;
    }
}
