package numbersystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        String binary = "";

        // keep asking until user enters a non-zero number
        while (num == 0) {

            System.out.println();
            System.out.print("Enter A Decimal Number : ");
            num = input.nextInt();
            System.out.println();

            // show error only if input was invalid (0)
            if (num == 0) {
                System.out.println("[Error] Please Enter A valid Number ");
                System.out.println();
            }
        }

        // save a copy, since num will change in the loop below
        int originalNum = num;

        // convert decimal to binary using divide-by-2 method
        while (num > 0) {

            int remainder = num % 2;              // get the last bit (0 or 1)
            binary = remainder + binary;           // add new bit to the front of the string
            num = num / 2;                          // remove the last bit, move to next digit
        }

        // display the final result
        System.out.println("Your Decimal " + originalNum + " Converted in binary  : ");
        System.out.println("------------------");
        System.out.println(binary);
        System.out.println("------------------");

        input.close();
    }
}