package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        // Taking User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Decimal Number : ");

        // store the number entered by user
        int num = sc.nextInt();

        // save a copy, since num will change in the loop
        int originalNum = num;

        // will store the final binary result
        String binary = "";

        // keep looping until num becomes 0
        while (num > 0) {

            int remainders = num % 2;

            // add new bit to the front of the string
            binary = remainders + binary;

            // remove the last bit, move to next digit
            num = num / 2;

        }
        // Printing the binary Number
        System.out.println("Binary Of " + originalNum + " : " + binary);
    }
}