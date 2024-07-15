import java.util.InputMismatchException;
import java.util.Scanner;

public class P12_minAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        double number = 0;
        boolean firstTime = true;


        System.out.println("Max/Min number finder");
        System.out.println("Enter non numerical input to exit");

        do {
            try{
                System.out.println("Enter number: ");
                number = scanner.nextDouble();

                if (firstTime){
                    max = number;
                    min = number;
                    firstTime = false;
                }

                if (number > max){
                    max = number;
                }

                if (number < min){
                    min = number;
                }

            } catch (InputMismatchException e){
                System.out.println("Exiting program...");
                scanner.next();
                break;
            }
        } while (true);

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
