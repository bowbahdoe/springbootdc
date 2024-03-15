package com.pump.webshop.utils;

import com.pump.webshop.dao.OrderRepository;
import com.pump.webshop.dao.UserRepository;
import com.pump.webshop.models.Order;
import com.pump.webshop.models.User;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Seeder {
    private OrderRepository orderRepository;
    private UserRepository userRepository;

    public Seeder(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        Order order1 = new Order(1,1,"A", LocalDate.of(1999,03,20));
        Order order2 = new Order(2,3,"B", LocalDate.of(2000,03,20));
        Order order3 = new Order(30,5,"Bijna", LocalDate.of(200000,03,20));

        this.orderRepository.save(order1);
        this.orderRepository.save(order2);
        this.orderRepository.save(order3);
    }
}
