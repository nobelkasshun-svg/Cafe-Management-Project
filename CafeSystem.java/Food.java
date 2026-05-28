package cafe;

/**
 * V3.0 - Inheritance: Food "is-a" MenuItem
 * V4.0 - Method Overriding (runtime polymorphism)
 */
public class Food extends MenuItem {

    // Food's own unique field
    private boolean isVegetarian;

    // V3.0: Constructor calls parent using super()
    public Food(String itemId, String name,
                double price, boolean isVegetarian) {
        super(itemId, name, price);
        this.isVegetarian = isVegetarian;
    }

    // Getter
    public boolean isVegetarian() {
        return isVegetarian;
    }

    // V4.0: Overriding abstract method from MenuItem
    @Override
    public String getCategory() {
        return "Food";
    }

    // V4.0: Overriding displayInfo from MenuItem
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
            "   Vegetarian: " + isVegetarian
        );
    }
}