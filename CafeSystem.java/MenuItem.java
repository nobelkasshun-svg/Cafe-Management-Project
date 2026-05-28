package cafe;

/**
 * V1.0 - Base class with attributes and methods
 * V2.0 - Encapsulation with private fields
 * V3.0 - Abstract class to be inherited
 * V4.0 - Abstract method enables polymorphism
 */
public abstract class MenuItem {

    // V2.0: private fields
    private String itemId;
    private String name;
    private double price;
    private boolean isAvailable;

    // V1.0: Constructor
    public MenuItem(String itemId, String name, double price) {
        this.itemId      = itemId;
        this.name        = name;
        this.price       = price;
        this.isAvailable = true;
    }

    // V2.0: Getters
    public String getItemId()     { return itemId; }
    public String getName()       { return name; }
    public double getPrice()      { return price; }
    public boolean isAvailable()  { return isAvailable; }

    // V2.0: Setters with validation
    public void setPrice(double price) {
        if (price > 0) this.price = price;
        else System.out.println("Price must be positive.");
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // V4.0: Abstract method - subclasses MUST override
    public abstract String getCategory();

    // V4.0: Method OVERLOADING (compile-time polymorphism)
    public double calculateTotal(int quantity) {
        return price * quantity;
    }

    public double calculateTotal(int quantity, double discountPercent) {
        double total = price * quantity;
        return total - (total * discountPercent / 100);
    }

    // V1.0: Display method
    public void displayInfo() {
        System.out.println(
            "[" + itemId + "] " + getCategory() +
            " - " + name +
            " | $" + price +
            " | Available: " + isAvailable
        );
    }
}
