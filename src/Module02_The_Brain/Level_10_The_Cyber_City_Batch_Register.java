/*
Your Task: Write a program that registers a "batch" of new citizens. The program should run until you have registered exactly 3 valid citizens or until the user types "STOP".

The Logic:

The Loop: Use a while loop that keeps track of a count (starting at 0).

Input: Inside the loop, ask for a Name and a Security Level (int).

The "Glitch" Rule (Continue): If the Security Level entered is negative, print "Invalid Level. Skipping..." and use continue to restart the loop without increasing the count.

The "Emergency" Rule (Break): If the Name entered is "STOP", print "Registration Aborted." and break the loop immediately.

The Decision (If-Else): * If the level is 10 or higher, print "[Name] assigned to High District.".

Otherwise, print "[Name] assigned to Low District.".

The Counter: Increase your count variable only after a successful registration.

Final Summary: Once the loop ends, print "Total Citizens Registered: [count]".

Requirements:

Use a while loop.

Use both break and continue correctly.

Remember to use userInput.nextLine() after nextInt() to keep the Scanner buffer clean.
 */

package Module02_The_Brain;

import java.util.Scanner;

public class Level_10_The_Cyber_City_Batch_Register {

    void main() {

        int count = 0;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Enter Name: ");
            String userName = userInput.nextLine();

            if (userName.equals("STOP")) {
                break;
            }

            System.out.println("Security Level: ");
            int securityLevel = userInput.nextInt();
            userInput.nextLine();

            if (securityLevel < 0) {
                System.out.println("Invalid Level. Skipping...");
                continue;
            } else if (securityLevel >= 10) {
                System.out.println(userName + " assigned to High District");
            } else {
                System.out.println(userName + " assigned to Low District");
            }

            count++;


        } while (count < 3);

        System.out.println("Total Citizens Registered " + count);
    }
}
