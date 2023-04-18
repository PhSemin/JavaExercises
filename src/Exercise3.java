// Calculator exercise to get familiar with if, else, and switch

public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 0 /* fill in */;
        int num2 = 0 /* fill in */;
        String action = "" /* fill in */;

        // "if" statement checks if the condition is true
        if (action.equals("/") && num2 == 0) {
            System.out.println("Cannot divide by zero");
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