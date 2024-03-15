package com.pump.webshop.controllers;


import com.pump.webshop.DTO.OrderDTO;
import com.pump.webshop.dao.OrderDAO;
import com.pump.webshop.models.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderDAO orderDAO;

    public OrderController(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrder() {
        List<Order> orders = this.orderDAO.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderDTO orderDTO) {
        this.orderDAO.createOrder(orderDTO);
        return ResponseEntity.ok("Gelukt");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateOrder(@PathVariable long id, @RequestBody OrderDTO orderDTO) {
        this.orderDAO.updateTaskById(id,orderDTO);
        return ResponseEntity.ok("Updated order: " + id);
    }

    @PutMapping("/check/{id}")
    public ResponseEntity<String> checkOrder(@PathVariable long id) {
        this.orderDAO.checkOrderStatus(id);
        return ResponseEntity.ok("Updated order status, for: " + id);
    }

}
