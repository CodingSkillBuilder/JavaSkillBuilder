import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

record Town(String name, int distance){

    private static int cityCount = 0;

    public static int getCityCount(){
        return cityCount;
    }

    public Town{
        cityCount++;
    }

    @Override
    public String toString() {
        return name + "(" + distance + ")\n";
    }
}

public class Main {
    private static LinkedList<Town> cutePlaces = new LinkedList<>();
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");


        addtown(new Town("Sydney", 0));
        addtown(new Town("Alice Springs", 2771));
        addtown(new Town("Adelaide", 1374));
        addtown(new Town("Brisbane", 2771));
        addtown(new Town("Darwin", 3972));
        addtown(new Town("Melbourne", 877));
        addtown(new Town("Perth", 3923));


        ListIterator<Town> iterator = cutePlaces.listIterator();

        boolean forward = false;

        printMenu();

        WhileLoop: while (true){

            String choice = scanner.nextLine().toUpperCase();
            switch (choice){
                case "F" ->{
                    if(iterator.hasNext()){
                        if (!forward) iterator.next();
                        System.out.println(iterator.next());
                    } else {
                        System.out.println("No more cities further ahead");
                    }
                    forward = true;
                    System.out.println("Your choice here: ");
                }
                case "B" ->{

                    if(iterator.hasPrevious()){
                        if (forward) iterator.previous();
                        System.out.println(iterator.previous());
                    } else {
                        System.out.println("We are already at sydney");
                    }
                    forward = false;
                    System.out.println("Your choice here: ");
                }
                case "L" -> {
                    for (Town currentCity: cutePlaces){
                        System.out.println(currentCity);
                    }
                    System.out.println("Your choice here: ");
                }
                case "M" ->{
                    System.out.println("Here you go !!!\n");
                    printMenu();
                }

                    case "Q" ->{
                    System.out.println("Have a nice day...bye !!!");
                    break WhileLoop;
                }
                default -> System.out.println("Invalid entity...\nPlease try again");
            }
        }

    }


    private static void addtown(Town newTown){

        if (Town.getCityCount() == 1){
            cutePlaces.add(newTown);
            return;
        }

        for (Town currentTown: cutePlaces){
            if ((currentTown.name().equalsIgnoreCase(newTown.name())) || (currentTown.distance() == newTown.distance())){
                System.out.println("Duplicate found");
                return;
            }

        }

        int index = 0;
        for (Town currentTown: cutePlaces){
            if (currentTown.distance() >= newTown.distance()) {
                index = cutePlaces.indexOf(currentTown);
                break;
            }
            index++;
        }

        cutePlaces.add(index, newTown);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select a letter):
                    \t(F)orward
                    \t(B)ackward
                    \t(L)ist Place
                    \t(M)enu
                    \t(Q)uit
                Your choice here: """);
    }
}


