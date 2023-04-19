// Counting sheep exercise to get familiar with while, do-while, and for loops

/*
Loops are used in Java to repeat a certain block of code multiple times. There are three types of loops in Java:

1 while loop. A while loop is used to repeat a block of code while a certain condition is true.
Example:

int i = 1;
while (i <= 5) {
  System.out.println(i);
  i++;
}

2 do-while loop. A do-while loop is similar to a while loop, but the block of code is executed at least
    once before the condition is checked.
Example:

int i = 1;
do {
  System.out.println(i);
  i++;
} while (i <= 5);

3 for loop.  A for loop is used to repeat a block of code a specific number of times.
Example:

for (int i = 1; i <= 5; i++) {
  System.out.println(i);
}

*/

public class Exercise1 {
    public static void main(String[] args) {
        int sheep = 0;
        int numSheepToCount = 10;

        System.out.println("Let's count some sheep!");

        // while loop
        while (sheep > 0 /* fix the condition so the counting is correct */) {
            System.out.println(sheep + " sheep");
            // increment sheep counter
            sheep++;
        }
        System.out.println("Sheep counted with while loop: " + sheep);
        sheep = 0;

        // do-while loop
        do {
            System.out.println(sheep + " sheep");
            // increment sheep counter
            sheep++;
        } while (false /* change the condition */);
        System.out.println("Sheep counted with do-while loop: " + sheep);
        sheep = 0;

        // for loop
        for (/* initialization */; sheep > 0 /* fix the condition so the counting is correct */; /* update */) {
            System.out.println(sheep + " sheep");
            // increment sheep counter
            sheep++;
        }
        System.out.println("Sheep counted with for loop: " + sheep);

        sheep = 0;
        System.out.println("Zzzzzz...");
    }
}