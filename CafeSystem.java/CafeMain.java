package cafe;

public class CafeMain {
    public static void main(String[] args) {

        CafeManager manager = new CafeManager();

        // V1.0: Create Food objects
        Food food1 = new Food("F001", "Pasta",       8.50, true);
        Food food2 = new Food("F002", "Beef Burger", 10.0, false);
        Food food3 = new Food("F003", "Garden Salad", 6.0, true);

        // V1.0: Create Drink objects
        Drink drink1 = new Drink("D001", "Iced Coffee", 4.50, true);
        Drink drink2 = new Drink("D002", "Hot Tea",     3.00, false);
        Drink drink3 = new Drink("D003", "Lemonade",    3.50, true);

        // Add to menu
        manager.addMenuItem(food1);
        manager.addMenuItem(food2);
        manager.addMenuItem(food3);
        manager.addMenuItem(drink1);
        manager.addMenuItem(drink2);
        manager.addMenuItem(drink3);

        // Show full menu
        manager.displayMenu();

        // Show only Food
        manager.displayMenu("Food");

        // Show only Drinks
        manager.displayMenu("Drink");

        // Create orders
        Order order1 = new Order("O001", "Abebe Girma");
        order1.addItem(food1);
        order1.addItem(drink1);

        Order order2 = new Order("O002", "Sara Tadesse");
        order2.addItem(food2);
        order2.addItem(drink2);
        order2.addItem(food3);

        // Add orders to manager
        manager.addOrder(order1);
        manager.addOrder(order2);

        // Display all orders
        manager.displayAllOrders();

        // V4.0: Method overloading demo
        System.out.println(
            "\nPasta x2 with 10% discount: $" +
            food1.calculateTotal(2, 10)
        );

        // V4.0: Superclass reference demo
        MenuItem item = new Drink("D004", "Orange Juice", 4.0, true);
        System.out.println(
            "\nCategory: " + item.getCategory()
        );
        item.displayInfo();
    }
}
