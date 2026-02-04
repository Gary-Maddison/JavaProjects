/*
Your Task: Write a program that asks the user for their name and the year they were born. The program should then
calculate their age based on the current year (2026) and print a personalized message.  The output should look exactly
like this (assuming the user enters "Amigo" and "2000"):

Enter your name:
Amigo
Enter your birth year:
2000
Amigo, you are 26 years old! 🚀
 */

package Module01_TheEngine;

import java.util.Scanner;

public class Level_2_The_Interactive_Age_Calculator {

    void main() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your birth year: ");
        int year = keyboard.nextInt();
        int age = 2026 - year;

        System.out.println(name + ", you are " + age + " years old! \uD83D\uDE80");


    }
}
