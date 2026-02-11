/*
Your Task: Write a program that protects a secret vault. It must repeatedly ask the user for a password until they enter the correct one.

The Logic:

Set a String variable secretPassword to "Cyber2026".

Use a loop to ask the user: "Enter Vault Password: ".

Read the user's input using Scanner.nextLine().

If the password is wrong, print "Access Denied. Try again." and let the loop repeat.

Bonus Rule: If the user types "EXIT", use the break command to stop the loop immediately and print "System Shutting Down...".

If they get it right, exit the loop and print "Vault Opened. Welcome, Agent.".

Requirements:

Use .equals() for string comparison.

Ensure the loop doesn't become "infinite" by properly updating the input variable inside the loop body.
 */

package Module02_The_Brain;

import java.util.Scanner;

public class Level_8_The_Password_Vault {

    void main() {
        String secretPassword = "Cyber2026";
        String userPassword = "";

        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("Enter Password: ");
            userPassword = userInput.nextLine();

            if (userPassword.equals("EXIT")) {
                break;
            } else if (userPassword.equals(secretPassword)) {
                System.out.println("Password Correct");
            } else {
                System.out.println("Access Denied!");
            }

        } while (!userPassword.equals(secretPassword));

    }
}
