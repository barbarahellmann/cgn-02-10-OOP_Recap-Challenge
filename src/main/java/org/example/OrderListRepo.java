package org.example;

import java.util.*;

public class OrderListRepo {


    // Create a class OrderListRepo that contains a list of Order objects.
    List<Order> orders = new ArrayList<>();

    // Implement methods to add, remove, and (single order and all orders).
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order getOrder(int orderID) {
        for (int i =0; i<orders.size(); i++) {
            if (orders.get(i).orderID() == (orderID)) {
                return orders.get(i);
            }
        }
        System.out.println("Order not found");
        return null;
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}
