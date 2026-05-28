 # Cafe Management System

A console-based Cafe Management System built with Java,
demonstrating core Object-Oriented Programming (OOP) concepts.

---

## How to Compile and Run

Step 1: Compile all files
javac -d . MenuItem.java Food.java Drink.java Order.java CafeManager.java CafeMain.java

Step 2: Run the program
java cafe.CafeMain

---

## Project Structure

CafeSystem/
    ├── MenuItem.java
    ├── Food.java
    ├── Drink.java
    ├── Order.java
    ├── CafeManager.java
    └── CafeMain.java

---

## OOP Concepts Demonstrated

### V1.0 - Classes and Objects
- File: MenuItem.java - Line 8
- File: CafeMain.java - Line 6
- Created real world objects like Food, Drink and Order

### V2.0 - Encapsulation
- File: MenuItem.java - Lines 11 to 14
- All fields are private with getters and setters
- Data validation in setPrice() method

### V3.0 - Inheritance
- File: Food.java - Line 8
- File: Drink.java - Line 8
- Food and Drink both extend MenuItem using is-a relationship

### V4.0 - Polymorphism
- Method Overriding: Food.java Line 20, Drink.java Line 20
- Method Overloading: MenuItem.java Lines 43 to 51
- Superclass Reference: Order.java Line 10, CafeManager.java Line 10

---

## Sample Output

--- Cafe Menu ---
[F001] Food - Pasta | $8.5 | Available: true
   Vegetarian: true
[F002] Food - Beef Burger | $10.0 | Available: true
   Vegetarian: false
[F003] Food - Garden Salad | $6.0 | Available: true
   Vegetarian: true
[D001] Drink - Iced Coffee | $4.5 | Available: true
   Cold: true
[D002] Drink - Hot Tea | $3.0 | Available: true
   Cold: false
[D003] Drink - Lemonade | $3.5 | Available: true
   Cold: true

--- All Orders ---
--- Order ID: O001 ---
Customer: Abebe Girma
Items:
[F001] Food - Pasta | $8.5 | Available: true
[D001] Drink - Iced Coffee | $4.5 | Available: true
Total: $13.0

--- Order ID: O002 ---
Customer: Sara Tadesse
Items:
[F002] Food - Beef Burger | $10.0 | Available: true
[D002] Drink - Hot Tea | $3.0 | Available: true
[F003] Food - Garden Salad | $6.0 | Available: true
Total: $19.0

Pasta x2 with 10% discount: $15.3

---

## Author
- GitHub: nobelkasshun-svg
