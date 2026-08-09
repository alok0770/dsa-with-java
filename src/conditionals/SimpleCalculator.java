package conditionals;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        char operator;
        int secondNum;
        int result;

        // Taking user input
        System.out.print("Enter first number : ");
        firstNum = input.nextInt();

        System.out.print("Choose any operator (+ - * / % ) : ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number : ");
        secondNum = input.nextInt();

        System.out.println("------------------------");

        // perform operation based on the chosen operator
        switch (operator) {
            case '+' -> {
                result = firstNum + secondNum;
                System.out.println("Addition Result  : " + result);
            }
            case '-' -> {
                result = firstNum - secondNum;
                System.out.println("Subtraction Result  : " + result);
            }
            case '*' -> {
                result = firstNum * secondNum;
                System.out.println("Multiplication Result  : " + result);
            }
            case '/' -> {
                // avoid divide by zero crash
                if (secondNum == 0) {
                    System.out.println("Error: Second number can't be zero");
                } else {
                    result = firstNum / secondNum;
                    System.out.println("Division Result  : " + result);
                }
            }
            case '%' -> {
                // avoid modulus by zero crash
                if (secondNum == 0) {
                    System.out.println("Error: Second number can't be zero");
                } else {
                    result = firstNum % secondNum;
                    System.out.println("Modulus Result         : " + result);
                }
            }
            default -> System.out.println("Enter a valid operator (+ - * / %)");
        }

        System.out.println("------------------------");

        input.close();
    }
}