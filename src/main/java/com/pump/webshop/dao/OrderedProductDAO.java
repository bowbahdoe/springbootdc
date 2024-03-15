package com.pump.webshop.dao;

import com.pump.webshop.models.OrderedProduct;
import org.springframework.stereotype.Component;

@Component
public class OrderedProductDAO {
    OrderedProductRepository orderedProductRepository;

    public OrderedProductDAO(OrderedProductRepository orderedProductRepository) {
        this.orderedProductRepository = orderedProductRepository;
    }
}
