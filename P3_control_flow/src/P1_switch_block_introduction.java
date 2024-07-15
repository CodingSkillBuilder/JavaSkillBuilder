public class P1_switch_block_introduction {
    public static void main(String[] args) {
        int value = 4;

        if (value == 1){
            System.out.println("Value is one");
        } else if (value == 2){
            System.out.println("Value is two");
        } else {
            System.out.println("Value is not 1 neither 2");
        }


        //switch below acts in the same way how the if block works...
        switch (value) {
            case 1:   //acts as the first if condition
                System.out.println("Value is one");
                break;     //if there is no break statement it won't give the expected result
            case 2:   //acts as the else if condition(second if condition)
                System.out.println("Value is two");
                break;
            default:            // acts as the else condition
                System.out.println("Value is not 1 neither 2");
        }


        
    }

}
