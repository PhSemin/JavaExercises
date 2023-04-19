// Frog pond exercise to get familiar with containers

/*
ArrayList information

An ArrayList in Java is a type of data structure that can hold a collection of elements. It's like a box that can
store many things inside it.
You can use an ArrayList to store different types of objects such as strings, integers, or even other objects.
You can add or remove elements from the ArrayList dynamically. This means you can change the size
of the ArrayList at runtime.
To use an ArrayList, you need to create an instance of it using the "new" keyword.
Here's an example:
ArrayList<String> myList = new ArrayList<String>();
This code creates a new ArrayList that can hold strings. You can then add elements to the
ArrayList using the add() method:
myList.add("Hello");
myList.add("World");
This adds the strings "Hello" and "World" to the ArrayList. You can access elements in the ArrayList
using the get() method:
String myString = myList.get(0);
This gets the first element in the ArrayList, which is "Hello". You can also remove elements from the
ArrayList using the remove() method:
myList.remove(1);
This removes the second element in the ArrayList, which is "World".

Overall, an ArrayList is a useful tool in Java for storing and manipulating collections of elements.
*/

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

        // TODO: add some initial frogs to the pond and print what frogs are in the pond with displayFrogs()

        // TODO: remove some frogs and do the printing again

        // TODO: take any frog from the pond, rename it, and print again all frogs. Check that the frog's name has changed
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

    public void setName(String name) { this.name = name; }

    public int getSize() {
        return size;
    }
}