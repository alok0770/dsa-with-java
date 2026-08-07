package conditionals;

import java.util.Scanner;

public class IfElseBasics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String gender;
        System.out.print("Enter your gender -> ");
        gender = input.nextLine();

        if (gender.equals("M")) {
            System.out.println("Hello Good Morning Sir ");
        } else if (gender.equals("F")) {
            System.out.println("Hello Good Morning Ma'am ");
        } else {
            System.out.println("Please enter M/F ");
        }
    }
}