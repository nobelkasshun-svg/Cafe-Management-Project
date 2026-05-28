package cafe;

import java.util.ArrayList;

/**
 * V4.0 - Superclass references to manipulate subclass objects
 */
public class CafeManager {

    // V4.0: Superclass reference holds Food and Drink objects
    private ArrayList<MenuItem> menu   = new ArrayList<>();
    private ArrayList<Order> orders    = new ArrayList<>();

    // Add item to menu
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    // Add order
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Show full menu
    public void displayMenu() {
        System.out.println("\n--- Cafe Menu ---");
        for (MenuItem item : menu) {
            if (item.isAvailable()) item.displayInfo();
        }
    }

    // Show all orders
    public void displayAllOrders() {
        System.out.println("\n--- All Orders ---");
        for (Order order : orders) {
            order.displayOrder();
        }
    }

    // Find item by ID
    public MenuItem findItem(String itemId) {
        for (MenuItem item : menu) {
            if (item.getItemId().equals(itemId)) return item;
        }
        return null;
    }

    // V4.0: Method OVERLOADING
    public void displayMenu(String category) {
        System.out.println("\n--- " + category + " Menu ---");
        for (MenuItem item : menu) {
            if (item.getCategory().equals(category)
                && item.isAvailable()) {
                item.displayInfo();
            }
        }
    }
}
