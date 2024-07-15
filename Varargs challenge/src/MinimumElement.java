import java.util.Scanner;

public class MinimumElement {

    public static int[] input(){
        Scanner scanner = new Scanner(System.in);
        String numbers = "";
        while (true) {
            System.out.print("Enter a number (Q for exit): ");
            String entity = scanner.nextLine();
            if (entity.equals("Q")) break;
            numbers += entity + " ";
        }

        return readIntegers();
    }

    public static int[] readIntegers(int... numbers){

        return new int[] {};
    }
}
