/*
Write a Java program that simulates a simple calculator. The calculator should be able to perform the following
operations: addition, subtraction, multiplication, and division. However, instead of implementing each operation
as a separate method, you should use polymorphism to create a generic "MathOperation" class that can be extended
to implement each specific operation.

Here's how to get started (some of the code is already created, please check and try to understand how it works,
and fill in the blanks that you can find by comments next to them):

1 Create a "MathOperation" abstract class with an abstract method called "calculate". The method should
take two double parameters (num1 and num2) and return a double result.

2 Create four subclasses of "MathOperation": "Addition", "Subtraction", "Multiplication", and "Division".
Each subclass should implement the "calculate" method to perform its respective operation.

3 In your main program, create an instance of each subclass and add them to an array of "MathOperation" objects.

4 Prompt the user to enter two numbers and the desired operation (addition, subtraction, multiplication, or division).

5 Use a loop to iterate through the array of "MathOperation" objects and call the "calculate" method of the object
whose operation matches the user's choice. Print the result to the console.

6 OPTIONAL: You can notice that an exception might be thrown by the system when you enter wrong data. If you want to
practice exception handling and make the code better, you can add a try-catch block and exit a program if an exception
is caught. You can look up the exception class to be caught by running the program and intentionally entering bad
data, then use the name of the exception that you will see in the error message

Good luck!
 */

import java.util.Scanner;

abstract class MathOperation {
    protected String name;
    public MathOperation(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract double calculate(double num1, double num2);
}

class Addition extends MathOperation {
    Addition() { super("+"); }
    @Override
    public double calculate(double num1, double num2) {
        return 0; // Fill in the correct formula
    }
}

class Subtraction extends MathOperation {
    Subtraction() { super("-"); }
    @Override
    public double calculate(double num1, double num2) {
        return 0; // Fill in the correct formula
    }
}

class Multiplication extends MathOperation {
    Multiplication() { super("*"); }
    @Override
    public double calculate(double num1, double num2) {
        return 0; // Fill in the correct formula
    }
}

class Division extends MathOperation {
    Division() { super("/"); }
    @Override
    public double calculate(double num1, double num2) {
        return 0; // Fill in the correct formula
    }
}

public class Exercise5 {
    public static void main(String[] args) {
        // This array keeps all operations that our calculator "understands". The advantage of having polymorphism
        // to
        MathOperation[] operations = new MathOperation[] {
                new Addition(), new Subtraction(), new Multiplication(), new Division()
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.next());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.next());

        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;
        for (MathOperation op : operations) {
            if (operation.equals(op.getName())) {
                result = 0; // Fill in the correct statement
                break;
            }
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
