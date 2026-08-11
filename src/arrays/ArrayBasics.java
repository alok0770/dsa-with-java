package arrays;

import java.util.Scanner;

public class ArrayBasics {

    public static void main(String[] args) {

        // Declaration and initialization of an array
        // Syntax: dataType[] variableName = new dataType[size];

        int[] age = {21, 23, 45, 32, 20};

        System.out.println("========== AGE ARRAY ==========");

        // Printing or traversing the array using a normal for loop
        for (int i = 0; i < age.length; i++) {
            System.out.println("Index " + i + " : " + age[i]);
        }

        System.out.println();

        Scanner input = new Scanner(System.in);

        // Declare an array variable
        int[] marks;

        // Take the array size from the user
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        // Create the array with the given size
        marks = new int[size];

        System.out.println();
        System.out.println("Enter " + size + " marks:");

        // Take elements as input
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks [" + i + "]: ");
            marks[i] = input.nextInt();
        }

        System.out.println();
        System.out.println("========== MARKS ARRAY ==========");

        // Traverse the array using an enhanced for loop
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        System.out.println();
        System.out.println("=================================");

        input.close();
    }
}