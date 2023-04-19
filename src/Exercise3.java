// Calculator exercise to get familiar with if, else, and switch

/*
In Java, if, else, and switch statements are used to make decisions in a program based on certain conditions.
The if statement is used to test a condition, and if it is true, the code within the curly braces is executed.
If the condition is false, the code within the curly braces is skipped.
For example:
int x = 5;
if (x > 3) {
   System.out.println("x is greater than 3");
}
In this example, the if statement checks if the value of x is greater than 3. Since this condition is
true (x is 5), the code within the curly braces is executed and "x is greater than 3" is printed to the console.
The else statement can be used in conjunction with the if statement to provide an alternative code block
to execute if the condition in the if statement is false.
The switch statement is used to test multiple conditions and execute different code blocks based on
the value of a variable.

The following exercise demonstrates the usage of those statements in a real piece of code.
The "if" statement checks if you are trying to divide by zero (operation is division and the second number is 0),
and "else" statement informs that calculation is in progress (it runs if either operation is different or the second
number is not zero).
Then the "switch" has to perform the needed mathematical operation on two numbers depending on the chosen operation
and write the result to the variable "result". Then run the code and check that various calculations are correct.
Have fun!
*/
public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 0 /* fill in */;
        int num2 = 0 /* fill in */;
        String action = "" /* fill in */;

        // "if" statement checks if the condition is true
        if (action.equals("/") && num2 == 0) {
            System.out.println("Cannot divide by zero");
            return; // Exit the program now because we can't divide by zero
        }
        // "else" code performs if the "if" condition is false
        else {
            System.out.println("Calculating...");
        }

        int result = 0;

        // "switch" statement checks if argument is equal to any of the possible values
        switch(action) {
            case "+":
                /* fill in */;
                break;
            case "-":
                /* fill in */;
                break;
            case "*":
                /* fill in */;
                break;
            case "/":
                /* fill in */;
                break;
            case "%":
                /* fill in */;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result: " + result);
    }
}