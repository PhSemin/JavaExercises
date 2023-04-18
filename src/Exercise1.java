// Counting sheep exercise to get familiar with while, do-while, and for loops

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