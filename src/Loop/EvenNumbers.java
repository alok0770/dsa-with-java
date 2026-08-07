package Loop;

public class EvenNumbers {
    public static void main(String[] args) {
       // EvenNumbers.EvenNumber();
        OddNumber();
    }

        static void EvenNumber () {
            for (int i = 2; i <= 100; i = i + 2) {
                System.out.println(i);
            }
        }

        static void OddNumber ()
        {
            for (int x = 1; x <= 100; x = x + 2) {
                System.out.println(x);
            }
        }

    }

