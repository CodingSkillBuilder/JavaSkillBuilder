import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");

        System.out.println("""
                Please select an option
                Q - Quick meal
                D - Custom meal
                Any other key to Exit
                Your choice here: 
                """);

        String choice = scanner.nextLine().substring(0, 1).toUpperCase();
        switch (choice){
            case "Q" ->{
                Potions.defaultMeal();
                System.out.println(Potions.getMasterPrice());
                System.out.println("Total:          " + Potions.getMasterPrice());
                System.out.println("Good bye have a nice day!!!");
            }
            case "D" -> {
                Potions.customMeal();
                System.out.println(Potions.getMasterPrice());
                System.out.println("Total:          " + Potions.getMasterPrice());
                System.out.println("Good bye have a nice day!!!");
            }
            default -> System.out.println("Good bye have a nice day!!!");
        }
    }
}