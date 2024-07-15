import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> theList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");

        whileLoop: while (true) {
            System.out.print("""
                    Available actions:
                    \t0 - to shutdown
                    \t1 - to add item(s) to list (comma delimited list)
                    \t2 - to remove any items (comma delimited list)
                    Enter a  number for which action you want to do: 
                    """);
            String choice = scanner.nextLine();
            switch (choice){
                case "1" ->add(format());
                case "2" ->remove(format());
                case "0" ->{
                    System.out.println("Have a nice day");
                    break whileLoop;
                }
                default -> System.out.println("Invalid entry Please try again :)");
            };
        }
    }

    public static void add(String[] items){
        theList.addAll(List.of(items));
        System.out.println(theList);
    }

    public static void remove(String[] items){
        theList.removeAll(List.of(items));
        System.out.println(theList);
    }

    public static String[] format(){
        ArrayList<String> temp = new ArrayList<>();
        System.out.print("""
                Enter your choices as a list here: 
                """);
        Scanner scanner = new Scanner(System.in);
        String list = scanner.nextLine();
        String[] listed = list.split(",");
        for (int i = 0; i < listed.length; i++){
            listed[i] = listed[i].trim();
            if (!(theList.contains(listed[i]))) {
                temp.add(listed[i]);
            }
        }
        String[] toExport = temp.toArray(new String[0]);

        return toExport;
    }
}