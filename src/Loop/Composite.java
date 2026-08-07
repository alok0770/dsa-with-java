package Loop;

import java.util.Scanner;

// composite prime Numbers
public class Composite {
    public static void main(String[] args) {

        String line = "========================";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
            }
        }
        if (num == 0)

            System.out.println("* Neither prime Nor composite");

        else if (flag == false)

            System.out.println("* Its a prime Number ");

        else
            System.out.println("* Its a Composite number ");

        System.out.println(line);
    }
}


