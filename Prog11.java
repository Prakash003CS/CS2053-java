// Lab Session 11: Lambda Expressions and Functional Interfaces
// File: Prog11.java
// Demonstrates sorting Product objects using Lambda expressions

import java.util.*;

class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-10s | Price: %.2f", id, name, price);
    }
}

public class Prog11 {
    public static void main(String[] args) {

        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 75000.0));
        products.add(new Product(102, "Headphones", 2500.0));
        products.add(new Product(103, "Mouse", 700.0));
        products.add(new Product(104, "Keyboard", 1200.0));
        products.add(new Product(105, "Monitor", 15000.0));

        System.out.println("=== Original Product List ===");
        products.forEach(System.out::println);

        // Sort by Price (using Lambda expression)
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        System.out.println("\n=== Products Sorted by Price (Ascending) ===");
        products.forEach(System.out::println);

        // Sort by Name (using Lambda expression)
        products.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        System.out.println("\n=== Products Sorted by Name (Alphabetical) ===");
        products.forEach(System.out::println);

        // Using a block lambda to find the most expensive product
        Product maxProduct = products.stream()
                .max((p1, p2) -> {
                    if (p1.getPrice() > p2.getPrice()) return 1;
                    else if (p1.getPrice() < p2.getPrice()) return -1;
                    else return 0;
                })
                .orElse(null);

        System.out.println("\n💰 Most Expensive Product:");
        System.out.println(maxProduct);
    }
}
