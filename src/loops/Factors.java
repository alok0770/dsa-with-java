package loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

           // counts total factors, starts at 0
        boolean isRunning = true;

        while(isRunning) {
            System.out.print("Enter a number : ");
            num = input.nextInt();

            int count = 0;

            if(num == 0){
                isRunning = false;
            }

            System.out.println("-------------------------");

            // check every number from 1 to num, print if it's a factor and count it
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    count++;
                }
            }
            System.out.println("-------------------------");
            System.out.println("Total factors : " + count);
            System.out.println("-------------------------");
        }
        
        input.close();
    }
}