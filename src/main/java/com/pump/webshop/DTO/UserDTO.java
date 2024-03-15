package com.pump.webshop.DTO;


public record UserDTO(String name, String lastName, int addressID, String emailAddress, String password, boolean authority) {
}