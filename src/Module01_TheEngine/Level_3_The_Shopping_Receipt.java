/*
Your Task: Create a "Mini-Receipt Generator." The program should ask the user for the name of an item, its
price (as a whole number), and how many they want to buy. Then, it should calculate the total and print a
formatted receipt.

--- STORE CHECK ---
Item: Apples
Price: 5
Quantity: 3
-------------------
TOTAL: 15
-------------------
THANK YOU, [USER NAME]!
 */

package Module01_TheEngine;

import java.util.Scanner;

public class Level_3_The_Shopping_Receipt {

    void main() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = keyboard.nextLine();

        System.out.print("Item name: ");
        String item = keyboard.nextLine();

        System.out.print("Price: £");
        double price = keyboard.nextDouble();

        System.out.print("Quantity: ");
        int quantity = keyboard.nextInt();

        double total = price * quantity;

        System.out.println("--- STORE CHECK ---");
        System.out.println("Item:" + item);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------");
        System.out.println("Total: £" + total);
        System.out.println("-------------------");
        System.out.println("THANK YOU " + name);


    }
}
