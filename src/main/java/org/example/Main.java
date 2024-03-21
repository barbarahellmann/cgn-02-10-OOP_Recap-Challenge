package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Book", 1, 10, 10.99);
        Product product2 = new Product("Bag", 2, 20, 11.99);
        Product product3 = new Product("Chair", 3, 30, 12.99);
        Product product4 = new Product("Table", 4, 40, 13.99);


        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);

        System.out.println(productRepo.getAllProducts());
        productRepo.removeProduct(product1);
        System.out.println(productRepo.getAllProducts());

    }
}