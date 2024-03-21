package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ShopService {
    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    /**
     * Implement a method to place a new order.
     * @param order = zukünftige Bestellung
     */

    public void placeOrder (Order order) {
        if (productIsPresent(order)) {
            orderListRepo.addOrder(order);
            System.out.println("Order placed");
         } else
             {
             System.out.println("Order cannot be placed");
        }
    }

    /**
     * Hilfsmethode für den loop zur Prüfung, ob der Artikel,
     * der bestellt werden soll in der Produkt-Liste existiert
     * @param order
     * @return
     */
    private boolean productIsPresent (Order order) {
        for (Product p : productRepo.getAllProducts()) {  // Product p = temporär
            if (p.name().equals(order.productName())) {
               return true;
           }
        } return false;

    }
}