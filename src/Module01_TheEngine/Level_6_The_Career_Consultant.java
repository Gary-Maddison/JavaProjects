/*
Your Task: Create a program that acts as a Career Consultant for the year 2026.

The Requirements:

Input: Ask for the user's Name, Current Job, and Annual Salary (int).

Logic:

If their job is already "Programmer", print: "You are already leading the revolution! 🚀".

Else if their salary is less than 50,000, use a Nested If to check if they have a Scanner input of "yes" to the
question "Are you ready to learn Java?".

If "yes", print: "Time to join CodeGym and double that salary!".

Otherwise, print: "Software is eating the world, don't get left behind.".

Calculation: Use an int to show them what a 15% AI-productivity bonus would look like on their current salary.

Formula: bonus = salary * 0.15 (Note: You may need to cast this or use a double for the calculation and convert it
back to an int for the final "box").

The Ternary Finish: Create a boolean variable isRich that is true if their salary is over 100,000. Use a Ternary
Operator to print either "Status: High Value Specialist" or "Status: Emerging Talent" based on that boolean.
 */

package Module01_TheEngine;

import java.util.Scanner;

public class Level_6_The_Career_Consultant {

    void main() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter name: ");
        String userName = userInput.nextLine();

        System.out.println("Enter Job: ");
        String currentJob = userInput.nextLine();

        System.out.println("Enter annual salary: ");
        int annualSalary = userInput.nextInt();
        userInput.nextLine();


        if (currentJob.equals("Programmer")) {
            System.out.println(userName + " you are already leading the revolution");
        } else if (annualSalary < 100_000) {
            System.out.println("Are you ready to learn Java (Yes/No)");
            String decision = userInput.nextLine();

            if (decision.equals("Yes")) {
                System.out.println("Time to join codeGym and double that salary");
            } else {
                System.out.println("Software is eating the world, don't get left behind");
            }
        }

        double bonusSalary = annualSalary * 0.15D;
        System.out.println("A 15% AI-productivity bonus would increase your salary to: " + bonusSalary);

        boolean isHighEarner = (annualSalary > 100_000);
        String status = isHighEarner ? "High Value Specialist" : "Emerging Talent";
        System.out.println("Status: " + status);
    }
}