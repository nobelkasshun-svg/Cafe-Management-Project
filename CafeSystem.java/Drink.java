package cafe;

/**
 * V3.0 - Inheritance: Drink "is-a" MenuItem
 * V4.0 - Method Overriding (runtime polymorphism)
 */
public class Drink extends MenuItem {

    // Drink's own unique field
    private boolean isCold;

    // V3.0: Constructor calls parent using super()
    public Drink(String itemId, String name,
                 double price, boolean isCold) {
        super(itemId, name, price);
        this.isCold = isCold;
    }

    // Getter
    public boolean isCold() {
        return isCold;
    }

    // V4.0: Overriding abstract method from MenuItem
    @Override
    public String getCategory() {
        return "Drink";
    }

    // V4.0: Overriding displayInfo from MenuItem
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
            "   Cold: " + isCold
        );
    }
}
