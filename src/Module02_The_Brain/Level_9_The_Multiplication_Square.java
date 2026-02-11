/*
The Logic:

Use a nested for loop (an outer loop for rows and an inner loop for cols).

Both loops should run from 1 to 5.

Inside the inner loop, print the result of row * col followed by a space or a tab (\t).

The "Glitch" Rule: If the result of row * col is equal to 7 or 13, use the continue statement to skip printing that specific number (CyberCity doesn't like those "unlucky" numbers!).

After the inner loop finishes a row, print a line break (System.out.println()) so it looks like a square grid.

1   2   3   4   5
2   4   6   8   10
3   6   9   12  15
... (and so on, skipping any 7 or 13)
 */

package Module02_The_Brain;

public class Level_9_The_Multiplication_Square {

    void main() {


        for (int outerLoop = 1; outerLoop <= 5; outerLoop++) {
            for (int innerLoop = 1; innerLoop <= 5; innerLoop++) {
                if (outerLoop * innerLoop == 7 || outerLoop * innerLoop == 13) {
                    continue;
                }

                System.out.print(outerLoop * innerLoop + "\t");
            }
            System.out.println(); // Line break after each row
        }

    }
}
