import java.util.InputMismatchException;
import java.util.Scanner;
public class P12_numberChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentNumber = 1;
        while (currentNumber <= 5){
            try {
                System.out.print("Enter number " + currentNumber + ": ");
                int number = scanner.nextInt();
                currentNumber ++;
            } catch (InputMismatchException e){
                //you have to import a new module in order to run this kind of exception
                System.out.println("Please enter a valid number.");
                scanner.next();                    // clears the scanner buffer or
            }                                       //the code will end up entering an infinity loop
        }

    }

    public static void anotherWay() {
        Scanner scanner = new Scanner(System.in);

        int currentNumber = 1;
        while (currentNumber <= 5){
            try {
                System.out.print("Enter number " + currentNumber + ": ");
                String number = scanner.nextLine();
                int numberInt = Integer.parseInt(number);
                currentNumber ++;
            } catch (NumberFormatException e) {

                System.out.println("Please enter a valid number.");
//                scanner.next();
                //realise that the above statement is no longer needed the scanner has already done its job
                //the error has occurred in the next line where the data conversion occurs


            }
        }

    }


}


