package org.example;

import java.util.*;
public class ProductRepo {

    // Create a class ProductRepo that contains a list of Product objects.
    List<Product> products = new ArrayList<>();

    // Implement methods to add, remove, and get products (single product and all products).
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getProduct(String name) {
        for (int i =0; i<products.size(); i++) {
            if (products.get(i).name().equals(name)) {
                return products.get(i);
            }
        }
        System.out.println("Product not found");
        return null;
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
