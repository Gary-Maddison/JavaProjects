/*
Your Task: Create a security gate program for a high-tech lab. The program should ask for a security level (an int)
and a secret password (a String).

The Logic:

If the security level is 10 or higher, the user is granted access immediately (no password needed).
Otherwise (if level is below 10), the user must provide the password "Java25" to enter.
If the level is below 10 and the password is wrong, print "Access Denied."

Enter security level:
5
Enter password:
Java25
Access Granted! 🔓
 */

package Module02_The_Brain;

import java.util.Scanner;

public class Level_4_The_Security_Gate {

    void main() {
        int securityLevel = (10);
        String secretPassword = ("Java25");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter security level: ");
        int userSecurityLevel = userInput.nextInt();
        userInput.nextLine();

        if (userSecurityLevel >= securityLevel) {
            System.out.println("Access Granted");

        } else {
            System.out.println("Enter password: ");
            String userPassword = userInput.nextLine();

            if (userPassword.equals(secretPassword)) {
                System.out.println("Access Granted!!!");
            } else {
                System.out.println("Access Denied!!");
            }
        }
    }
}
