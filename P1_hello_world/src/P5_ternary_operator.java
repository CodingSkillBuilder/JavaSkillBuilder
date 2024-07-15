public class P5_ternary_operator {
    public static void main(String[] args) {
        int age = 20;
        String is_kid = ((age >= 18) ? "an adult" : "still a kid");    // used here is the ternary operator it comes  in the following format
        //    (condition) ? (if true return this) : (else return this)
        System.out.println("The person is " + is_kid);
    }
}
