package com.pump.webshop.controllers;

import com.pump.webshop.dao.OrderedProductDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordered")
public class OrderedProductController {
    private OrderedProductDAO orderedProductDAO;

    public OrderedProductController(OrderedProductDAO orderedProductDAO) {
        this.orderedProductDAO = orderedProductDAO;
    }
}
