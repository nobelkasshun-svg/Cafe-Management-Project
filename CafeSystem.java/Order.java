package cafe;

import java.util.ArrayList;

/**
 * V1.0 - Class with attributes and methods
 * V2.0 - Encapsulation with private fields
 * V4.0 - Superclass reference holds subclass objects
 */
public class Order {

    private String orderId;
    private String customerName;

    // V4.0: Superclass reference holds Food and Drink objects
    private ArrayList<MenuItem> items = new ArrayList<>();

    // Constructor
    public Order(String orderId, String customerName) {
        this.orderId      = orderId;
        this.customerName = customerName;
    }

    // Getters
    public String getOrderId()      { return orderId; }
    public String getCustomerName() { return customerName; }

    // Add item to order
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Calculate total price of order
    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Display full order
    public void displayOrder() {
        System.out.println("\n--- Order ID: " + orderId + " ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Items:");
        for (MenuItem item : items) {
            item.displayInfo();
        }
        System.out.println(
            "Total: $" + calculateTotal()
        );
    }
}