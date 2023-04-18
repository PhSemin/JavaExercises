/*
Exception handling is a mechanism that allows you to handle errors or unexpected situations that may occur
during the execution of a program. In Java, an exception is an object that represents an error or an exceptional
condition that occurs during the execution of a program. When an exception occurs, the Java Virtual Machine (JVM)
creates an exception object and throws it.

Let's say we are building a program to calculate the average of an array of integers. However, the program
should handle the case when the array is empty.

- Inside the calculateAverage method, calculate the average of the numbers. You can use a for loop to iterate over
    the array and sum up the numbers, and then divide the sum by the length of the array.
- If the array is empty, throw an exception with the message "Cannot calculate the average of an empty array".
- Run the program and observe the output. If the array is not empty, the program should print the average.
    If the array is empty, the program should print the error message.

That's it! This exercise introduces the basics of exception handling in Java by demonstrating how to handle an
exceptional condition that may occur during the execution of a program.
 */

public class Exercise4 {

    public static void main(String[] args) {

        // Create an array of integers
        int[] numbers = { 3, 7, 9, 2, 5 };

        // Call the calculateAverage method and print the result
        try {
            double average = calculateAverage(numbers);
            System.out.println("The average is: " + average);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateAverage(int[] numbers) {
        // TODO: Calculate the average of the numbers

        // TODO: If the array is empty, throw an exception with the message "Cannot calculate the average of an empty array"

        // TODO: Otherwise, calculate the average and return it
    }
}