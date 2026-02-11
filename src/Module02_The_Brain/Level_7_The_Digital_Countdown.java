/*
Your Task: Write a program that performs a countdown for a rocket launch. It should count down from 10 to 1 and then print a final message.

Requirements:

Use a for loop that starts at 10 and decrements down to 1.

Inside the loop, print: "T-minus: [number]".

After the loop finishes, print: "Ignition... Lift off! 🚀"
 */

package Module02_The_Brain;

public class Level_7_The_Digital_Countdown {

    void main() {
        for (int countDown = 10; countDown > 0; countDown--) {  // initialization; condition; update
            System.out.println("T-minus: " + countDown);  // To keep the variable outside the loop leave the initialization empty (; countDown > 0; CountDown--;)
        }
        System.out.println("Ignition... Lift off! \uD83D\uDE80");
    }
}
