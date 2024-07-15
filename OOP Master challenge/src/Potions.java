import java.util.Scanner;

public class Potions {
    private static double masterPrice;
    private static StringBuilder bill = new StringBuilder("");

    public static double getMasterPrice() {
        return masterPrice;
    }

    public static StringBuilder getBill() {
        return bill;
    }

    public static void defaultMeal(){
        makeBurger(1);
        makeDrink(1);
        makeExtra(1);
    }


    public static void customMeal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please select a burger type
                C - Cool burger
                D - Delux burger
                Any other key - Don't want burger
                Please enter your choice here
                """);
        String choice = scanner.nextLine().substring(0, 1).toUpperCase();
        int size = switch (choice){
          case "C" -> 1;
          case "D" -> 2;
          default -> -1;
        };
        if (((choice.equals("C")) || (choice.equals("D")))) makeBurger(size);

        System.out.println("""
                Please select a drink size
                C - Cool drink
                D - Delux drink
                Any other key - Don't want drink
                Please enter your choice here
                """);
        choice = scanner.nextLine().substring(0, 1).toUpperCase();
        size = switch (choice){
            case "C" -> 1;
            case "D" -> 2;
            default -> -1;
        };
        if (choice == "C" || choice == "D") makeDrink(size);

        System.out.println("""
                Please select a extra size
                C - Cool extra
                D - Delux extra
                Any other key - Don't want extra
                Please enter your choice here
                """);
        choice = scanner.nextLine().substring(0, 1).toUpperCase();
        size = switch (choice){
            case "C" -> 1;
            case "D" -> 2;
            default -> -1;
        };
        if (choice == "C" || choice == "D") makeExtra(size);
    }

    public static void makeBurger(int size){
//        Scanner scanner = new Scanner(System.in);
        Object object = Burger.burgerFactory(size);
        if (object instanceof Burger){
            Burger burger = (Burger) object;
            bill.append(burger.getType() + "\n                    " + burger.getPrice()); //20
            masterPrice += burger.getPrice();
        }else{
            System.out.println((String) object);
        }
    }

    public static void makeDrink(int size){
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                C    - Cream Soda
                S    - Sprite
                F    - Fanta
                L    - Lime
                Please select a drink: 
                """);
        String choice = scanner.nextLine().substring(0, 1).toUpperCase();
        Object object = Drinks.drinkFactory(choice, size);
        if (object instanceof Drinks){
            Drinks drink = (Drinks) object;
            bill.append(drink.getType() + "         " + drink.getPrice());
            masterPrice += drink.getPrice();
        }else{
            System.out.println((String) object);
        }

    }

    public static void makeExtra(int size){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    R    - Ring onions
                    S    - Straw onions
                    P    - Potato fries
                    M    - Mushroom fries
                    V    - Veggie sticks
                    O    - Olives
                    Please select an extra: 
                """);
        String choice = scanner.nextLine().substring(0, 1).toUpperCase();
        Object object = Extras.extraFactory(choice, size);
        if (object instanceof Extras){
            Extras extras = (Extras) object;
            bill.append(extras.getType() + "         " + extras.getPrice());
            masterPrice += extras.getPrice();
        } else {
            System.out.println((String) object);
        }
    }
}


