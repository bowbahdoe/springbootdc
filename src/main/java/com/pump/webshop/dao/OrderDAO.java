package com.pump.webshop.dao;

import com.pump.webshop.DTO.OrderDTO;
import com.pump.webshop.models.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Component
public class OrderDAO {
    private OrderRepository orderRepository;

    public OrderDAO(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        List<Order> orders = this.orderRepository.findAll();
        return orders;
    }

    public void createOrder(OrderDTO orderDTO) {
        Order order = new Order(orderDTO.userID, orderDTO.paymentID, orderDTO.orderStatus, orderDTO.date);
        this.orderRepository.save(order);
    }

    public void updateTaskById(long id, OrderDTO orderDTO) {
        Optional<Order> optionalOrder = this.orderRepository.findById(id);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setOrderDate(orderDTO.date);
            order.setOrderStatus(orderDTO.orderStatus);
            order.setUserID(orderDTO.userID);
            order.setPaymentID(orderDTO.paymentID);
            this.orderRepository.save(order);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "\"Foutmelding!! Task met dat ID is er niet\""
            );
        }
    }

    public void checkOrderStatus(long id) {
        Optional<Order> optionalOrder = this.orderRepository.findById(id);
        if (optionalOrder.isPresent()){
            Order order = optionalOrder.get();
            order.setOrderStatus("Verzonden");
            this.orderRepository.save(order);
        } else {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "\"Foutmelding!! Task met dat ID is er niet\""
            );
        }
    }
}
