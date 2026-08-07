package loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A value ");
        int num = sc.nextInt();


        int highestFactor = 1;
        for (int i = num-1; i >1; i--) {
            if (num % i == 0) {
                highestFactor = i ;
                break;
            }
        }
        System.out.println(highestFactor);
    }
}



