package loops;

import java.util.Scanner;

//Geometry Progression
public class GeometricProgression {
    public static void main(String[] args) {

        // question :- Display this Gp - 2,4,8,16,32 ... upto n terms.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Value ");
        int count = sc.nextInt();

        int terms = 2;
        for (int i = 1; i <= count; i++) {
            System.out.println(terms);
            terms = terms * 2;
        }
    }
}



