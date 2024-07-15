public class P3_or_operators {
    public static void main(String[] args) {
        boolean is_boy = true;
        boolean is_girl = true;
        if ((is_boy == false) || (is_girl == false)){                    // "||" acts as the "or" operator
            System.out.println("What kind of a creature are you?");    // this statement won't run
        }
    }
}
