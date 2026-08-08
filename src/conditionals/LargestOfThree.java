package conditionals;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;
        int thirdNum;

        // Taking User Input
        System.out.print("Enter The First Number  : ");
        firstNum = input.nextInt();

        System.out.print("Enter The Second Number : ");
        secondNum = input.nextInt();

        System.out.print("Enter The Third Number  : ");
        thirdNum = input.nextInt();

        System.out.println();
        System.out.println("------------------------");

        // check if firstNum is greater than or equal to both others
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println("Largest Number : " + firstNum);
        }
        // check if secondNum is greater than or equal to both others
        else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println("Largest Number : " + secondNum);
        }
        // otherwise thirdNum must be the largest
        else {
            System.out.println("Largest Number : " + thirdNum);
        }

        System.out.println("------------------------");

        input.close();
    }
}