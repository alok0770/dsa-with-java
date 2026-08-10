package loops;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 10 + 1);   // random number between 1 and 10
        int guess;
        int attempts = 0;

        // keep guessing until the correct number is found
        do {
            System.out.print("Guess the number between 1 to 10 : ");
            guess = input.nextInt();
            attempts++;

            if (randomNum > guess) {
                System.out.println("Too low ! try again");
            } else if (randomNum < guess) {
                System.out.println("Too high ! try again");
            } else {
                System.out.println("Congratulation You Won");
            }
        } while (guess != randomNum);

        System.out.println("Total attempts taken " + attempts);
    }
}