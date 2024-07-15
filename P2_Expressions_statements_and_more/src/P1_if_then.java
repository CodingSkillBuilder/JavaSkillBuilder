public class P1_if_then {
    public static void main(String[] args) {
        double mark = 86;
        if ((mark < 0) && (mark > 100)){
            System.out.println("Invalid marks");
        } else if (mark > 75) {
            System.out.println("You've got an Ä grade");

        } else if (mark > 65) {
            System.out.println("You've got a B grade");
        } else if (mark > 55) {
            System.out.println("You've got a C grade");
        } else if (mark > 35) {
            System.out.println("You've got a B grade");
        } else {
            System.out.println("Sorry you have failed");
        }
    }
}



