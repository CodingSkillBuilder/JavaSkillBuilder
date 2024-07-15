import java.util.Scanner;

public class P9_while_loop_intro_challenge {
    public static void main(String[] args) {
        int start = 0;
        int end = 10;
        while (start <= end) {
            if ((isEvenNumber(start))) {
                System.out.println(start + " is a even number");
            }
            start++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
