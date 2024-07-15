import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private static ProductsForSale[] products = {new Pencil(), new Pen()};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<OrderItem> ordered = new ArrayList<>();
        System.out.printf("Welcome to my cute little store...");

        System.out.println(products.toString());
        WhileLoop: while (true){
            System.out.print("""
                    Please select and mention the quantity as a suffix (numerically)
                    C - Pencil
                    P - Pen
                    Q - Quit
                    ex: if you want 6 pencil; enter: P6
                    Your choice here: 
                    """);
            String input = scanner.nextLine();
            switch (input.substring(0,1).toUpperCase()) {
                case "C" -> ordered.add(new OrderItem(new Pencil(), Integer.parseInt(input.substring(1, 2))));
                case "P" -> ordered.add(new OrderItem(new Pen(), Integer.parseInt(input.substring(1, 2))));
                case "Q" -> {
                    break WhileLoop;
                }
                default -> System.out.println("Invalid entity...\nPlease try again...");
            }
        }

        if (!ordered.isEmpty()){
            double total = 0;
            for(OrderItem itemNow: ordered){
                int quantity = itemNow.getQuantity();
                itemNow.getProduct().addIno(quantity);
                total += itemNow.getProduct().priceCalc(quantity);
            }
            System.out.println("The total payable: $" + total);
        }

        System.out.println("Bye...\nHave a nice day");

    }
}
