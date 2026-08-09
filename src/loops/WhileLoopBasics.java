package loops;

public class WhileLoopBasics {
    public static void main(String[] args) {

        int number = 2;   // start from 2, since we want even numbers within 1-10

        // print even numbers from 2 to 10 using while loop
        while (number <= 10) {
            System.out.println(number);
            number += 2;
        }
    }
}