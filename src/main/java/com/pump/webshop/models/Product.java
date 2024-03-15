package com.pump.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private long id;
    private String SKU;
    private String name;
    private String description;
    private String category;
    private double price;
    private LocalDate date_added;
    private User added_by;
    private int stock;
    private boolean listed;

    public Product(long id, String SKU, String name, String description, String category, double price, LocalDate date_added, User added_by, int stock, boolean listed) {
        this.id = id;
        this.SKU = SKU;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.date_added = date_added;
        this.added_by = added_by;
        this.stock = stock;
        this.listed = listed;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate_added() {
        return date_added;
    }

    public void setDate_added(LocalDate date_added) {
        this.date_added = date_added;
    }

    public User getAdded_by() {
        return added_by;
    }

    public void setAdded_by(User added_by) {
        this.added_by = added_by;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isListed() {
        return listed;
    }

    public void setListed(boolean listed) {
        this.listed = listed;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", SKU='" + SKU + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", date_added=" + date_added +
                ", added_by=" + added_by +
                ", stock=" + stock +
                ", listed=" + listed +
                '}';
    }
}
