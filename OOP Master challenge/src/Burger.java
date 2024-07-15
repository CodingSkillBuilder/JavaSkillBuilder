import java.util.Scanner;

public class Burger extends Products{
    private StringBuilder type;

    public StringBuilder getType() {
        return type;
    }



    public void added(){
        System.out.println("Burger added !!!");
    }

    public static Object burgerFactory(int size){
        StringBuilder temp = new StringBuilder("");
        Burger burger = new Burger(0,size, temp);
        burger.burgerSelector();
        if (burger.getPrice() == 0){
            return "Error Creating burger";
        }else{
            return burger;
        }
    }


    public void burgerSelector() {

        switch (getSize()) {
            case 1 -> {                                           //9
                type.append("Burger \n" +
                        "toppings: \n");
                setPrice(getPrice() + 6);
                addTopings(3);
                System.out.println("Burger created !");
            }

            case 2 -> {
                type.append("Delux burger \n" +
                        "toppings: \n");
                setPrice(getPrice() + 35);
                addTopings(5);
                System.out.println("Delux burger created");
            }

            default -> System.out.println("Error making the burger");
        }

        added();

    }
    public void addTopings (int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                C   - Cheese
                E   - Egg
                O   - Onions
                M   - Mushrooms
                K   - Kimchi
                S   - Sauce
                G   - Guacamole
                Q   - That's it :)
                """);

        int i = 0;
        while (i < number){
            System.out.printf("Please select upto %d out of the following...", number);
            System.out.println("Enter your Choice here: ");
            String choice = scanner.nextLine().substring(0,1).toUpperCase();
            if (choice == "Q") break;
            Object topping = Topings.topingFactory(choice, getSize());
            if (topping instanceof Topings){
                Topings newToping = (Topings) topping;
                if (getSize() == 1) setPrice(getPrice() + newToping.getPlusPrice());
                type.append("         " + newToping.getType() + "\n");
                System.out.printf("%s topping got added %n", newToping.getType());
                i++;
            } else {
                System.out.println("Invalid input Please try again");
            }
        }

    }



    private Burger(double price, int size, StringBuilder type) {
        super(price, size);
        this.type = type;

    }
}
