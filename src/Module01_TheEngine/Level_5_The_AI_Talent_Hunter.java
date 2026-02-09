/*
Your Task: Write a "Recruiter Bot" for Meta to help them hire AI superstars.

The Logic:

Ask the user for two things:

Their Years of Experience (int).

Their Specialized Skill (String).

A candidate is "Hirable" if:

They have more than 10 years of experience AND their skill is "AI".

OR if their skill is "Grandmaster" (regardless of years).

Use a Ternary Operator to store the result ("Hired" or "Not Hired") in a String variable called decision.

Print the decision.
 */

package Module01_TheEngine;

import java.util.Scanner;

public class Level_5_The_AI_Talent_Hunter {

    void main() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Years of experience: ");
        int userExperience = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Specialized skill: ");
        String userSkill = userInput.nextLine();

        String decision = (userExperience > 10 && userSkill.equals("AI") || userSkill.equals("Grandmaster")) ? "Hired" : "Not Hired";
        System.out.println(decision);
    }
}

