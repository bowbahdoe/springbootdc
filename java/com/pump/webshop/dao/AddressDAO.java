package com.pump.webshop.dao;

import org.springframework.stereotype.Component;

@Component
public class AddressDAO {
    private AddressRepository addressRepository;

    public AddressDAO(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
}
