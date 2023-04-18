// Frog pond exercise to get familiar with containers

/*
You are designing a program that will simulate a frog pond. Each frog in the pond has a name and
a size (in centimeters). The program should allow the user to add frogs to the pond, remove frogs
from the pond, and display the list of frogs currently in the pond.

To complete this exercise, you need to write a Java program that does the following:

1 Create an ArrayList to hold the frogs in the pond.
2 Create a function called addFrog that takes two parameters: a String for the frog's name and an integer for the
    frog's size. The function should create a new Frog object with the given name and size, and add it to the ArrayList.
3 Create a function called removeFrog that takes one parameter: a String for the frog's name. The function should
    search the ArrayList for a Frog with the given name, and remove it if it exists.
4 Create a function called displayFrogs that takes no parameters. The function should iterate over the ArrayList
    and print out the name and size of each frog in the pond.
*/
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Frog> frogs = new ArrayList<Frog>();

        // TODO: add some initial frogs to the pond

        // TODO: add some code to allow the user to interact with the program
    }

    public static void addFrog(ArrayList<Frog> frogs, String name, int size) {
        // TODO: create a new Frog object with the given name and size, and add it to the ArrayList
    }

    public static void removeFrog(ArrayList<Frog> frogs, String name) {
        // TODO: search the ArrayList for a Frog with the given name, and remove it if it exists
    }

    public static void displayFrogs(ArrayList<Frog> frogs) {
        // TODO: iterate over the ArrayList and print out the name and size of each frog in the pond
    }
}

class Frog {
    private String name;
    private int size;

    public Frog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}