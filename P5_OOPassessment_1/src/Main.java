import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account person_1 = new Account();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        person_1.setAccName(scanner.nextLine());
        System.out.println("Enter your account number");
        person_1.setAccNumber(scanner.nextInt());


    }



    public static boolean withdrow(int amount){
        

        return false;
    }
}