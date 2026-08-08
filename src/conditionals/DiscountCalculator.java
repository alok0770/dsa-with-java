package conditionals;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount;
        double discountPercent;


            System.out.print("Enter Amount -> ");
            amount = input.nextInt();



            // decide ONLY the discount percentage here
            if (amount > 0 && amount <= 5000) {
                discountPercent = 0;
            } else if (amount <= 7000) {
                discountPercent = 5;
            } else if (amount <= 9000) {
                discountPercent = 10;
            } else if (amount > 9000) {
                discountPercent = 20;
            } else {
                discountPercent = -1;   // invalid amount signal
            }

            // calculation and printing happens ONCE, outside the ladder
            if (discountPercent == -1) {
                System.out.println("Invalid Amount : Please Enter A Valid Amount");
            } else {
                double discount = amount * discountPercent / 100;
                double finalPrice = amount - discount;

                System.out.println("You Get " + discountPercent + "% Discount");
                System.out.println("You Paid Only " + finalPrice);
            }
            input.close();
    }
}