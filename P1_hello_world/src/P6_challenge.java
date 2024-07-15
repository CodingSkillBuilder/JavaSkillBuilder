public class P6_challenge {
    public static void main(String[] args) {
        double step_1 = 20.00;
        double step_2 = 80.00;
        double step_3 = ((step_1 + step_2) * 100.00);
        double step_4 = step_3 % 40.00;
        boolean step_5 = (step_4 == 0) ? true : false;
        System.out.println("The result is: " + step_5);
        if (!step_5) System.out.println("got some remainder");

    }
}
