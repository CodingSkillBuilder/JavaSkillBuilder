public class P3_intro_to_methods {
    public static void main(String[] args) {
        int value = 90;
        boolean print_now = true;
        addToTen(print_now, 10, value);       // mind that the order matters
        value += 10;
        addToTen(print_now, 10, value);       // recalling the same method...
    }
    // as you may have noticed unlike in python there is no rule that methods should
    // be defined before we call them
    public static void addToTen(boolean show, int stat_value, int value) {  //mind that the order matters
        if (show) {
            int sum = stat_value + value;
            System.out.println("The sum is: " + sum);
        }
    }
}
