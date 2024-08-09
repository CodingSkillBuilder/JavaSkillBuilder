import java.util.ArrayList;

public class Main {
    private static ArrayList<Contacts> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello world!");



            // System.out.println("Try programiz.pro");
            Contacts c1 = new Contacts(12345, "name1");
            Contacts c2 = new Contacts(23456, "name2");
            Contacts c3 = new Contacts(12345, "name1");

            list.add(c1);
            list.add(c1);
            list.add(c1);
//            System.out.println(list.contains(c3));

        for (Contacts thisContact: list){
            System.out.println(list.indexOf(thisContact));
            if (list.indexOf(thisContact) == 1){
                System.out.println(thisContact);
                System.out.println("This is contact number 2 alright !");
            }

        }


    }

}

class Contacts{

    private int number;
    private String name;

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public Contacts(int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}