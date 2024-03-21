package org.example;

import java.util.List;

public interface OrderRepo {

    void add(Order order);

    void remove(Order order);

    void get(Order order);

    void getAll(List<Order> OrderRepo);
}
