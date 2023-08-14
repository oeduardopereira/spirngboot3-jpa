package com.eduardo.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardo.course.enteties.Order;
import com.eduardo.course.enteties.User;
import com.eduardo.course.enteties.enums.OrderStatus;
import com.eduardo.course.repositories.OrderRepository;
import com.eduardo.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User user1 = new User(null, "Carlos", "carlos@gmail.com", "23432234", "senha123");
        User user2 = new User(null, "Celma", "celminha@gmail.com", "78975674", "senha123");

        Order order1 = new Order(null, Instant.parse("2019-06-12T19:52:07Z"), user1, OrderStatus.WAITING_PAYMENT);
        Order order2 = new Order(null, Instant.parse("2019-06-12T19:56:54Z"), user1, OrderStatus.PAID);
        Order order3 = new Order(null, Instant.parse("2019-06-12T19:58:23Z"), user1, OrderStatus.SHIPPED);
        Order order4 = new Order(null, Instant.parse("2019-06-12T20:12:01Z"), user1, OrderStatus.DELIVERED);
        Order order5 = new Order(null, Instant.parse("2019-08-20T12:37:21Z"), user2, OrderStatus.CANCELED);
        Order order6 = new Order(null, Instant.parse("2019-08-21T08:40:41Z"), user2, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3, order4, order5, order6));
    }
}
