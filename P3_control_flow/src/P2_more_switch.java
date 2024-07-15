public class P2_more_switch {
    public static void main(String[] args) {
        int value = 4;
        switch (value){         //switch block won't support all the data types that the if block supports for an example
            case 1:                 // if the value was a double variable it will rise an error...check  my docs for more
                System.out.println("The value is one");
                break;
            case 2:
                System.out.println("The value is two");
                break;
            case 3: case 4: case 5:     // There is no way what we can use combination operators within the case of a
                System.out.println("The value is either tree or four or five"); //switch block so this is the way to
                System.out.println("The value is actually" + value);    //perform an or operation within the switch
        }
// above is the traditional switch block; below is the enhanced new switch block...better get used to this...
        switch (value){     //but don't forget the old as well it may become handy
            case 1 -> System.out.println("value is one");
            case 2 -> System.out.println("value is two");
            case 3, 4, 5 ->{
                System.out.println("The value is either tree or four or five");
                System.out.println("The value is actually" + value);
            }                           //realise that there is no need of the break when we use the modern switch
        }


    }
}
