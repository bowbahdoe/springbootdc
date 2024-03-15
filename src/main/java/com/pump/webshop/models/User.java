package com.pump.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lastName;
    private int addressID;
    private String emailAddress;
    private String password;
    private boolean authority;


    public User(String name, String lastName ,int addressID, String emailAddress, String password, boolean authority) {
        this.name = name;
        this.lastName = lastName;
        this.addressID = addressID;
        this.emailAddress = emailAddress;
        this.password = password;
        this.authority = authority;
    }

    public User() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthority() {
        return authority;
    }

    public void setAuthority(boolean authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressID=" + addressID +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", authority=" + authority +
                '}';
    }
}
