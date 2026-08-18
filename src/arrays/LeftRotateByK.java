package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {10,20,30,40,50,60};

        int n = numbers.length;

        System.out.print("Enter number to left rotate : ");
        int k = input.nextInt();

        k = k%n;

        for (int j = 1; j <=k ; j++) {
            int temp = numbers[0];

            for (int i = 1; i < n ; i++) {
                numbers[i-1] = numbers[i];
            }
            numbers[n-1] = temp;

        }

        System.out.println(Arrays.toString(numbers));
        }

    }

