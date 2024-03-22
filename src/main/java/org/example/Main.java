package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create OrderMapRepo or OrderListRepo
        OrderRepo orderRepo = new OrderMapRepo(); // Change this to OrderListRepo() if needed
        OrderRepo orderRepo2 = new OrderMapRepo();

        // Pass the orderRepo to the ShopService constructor
        ShopService shopService = new ShopService();

        // Implement the ProductRepo class with a list to store products.
        Product product1 = new Product("Book", 1,  10.99);
        Product product2 = new Product("Bag", 2, 11.99);
        Product product3 = new Product("Chair", 3,  12.99);
        Product product4 = new Product("Table", 4,  13.99);

        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);

        System.out.println(productRepo.getAllProducts());

        // Implement the OrderListRepo class with a list to store orders.

        OrderListRepo orderList = new OrderListRepo();
        Order order1 = new Order(11, 2, List.of(product1).toString());
        Order order2 = new Order(22, 3, List.of(product1).toString());
        Order order3 = new Order(33, 1, List.of(product2).toString());
        Order order4 = new Order(44, 2, List.of(product3).toString());
        Order order5 = new Order(55, 3, List.of(product4).toString());
        Order order6 = new Order(77, 1, List.of(product4).toString());

        orderList.addOrder(order1);
        orderList.addOrder(order2);
        orderList.addOrder(order3);
        orderList.addOrder(order4);
        orderList.addOrder(order5);
        orderList.addOrder(order6);

        System.out.println(orderList.getAllOrders());

    }


}