public class P6_forloop_intro {
    public static void main(String[] args) {
        for (int counter = 0; counter <=5; counter++){
            System.out.println(counter);
        }
       double amount = 100000;
       double interestAmount = 0.0;
       for(double interest = 5; interestAmount <= 8500; interest += 1.5){
           interestAmount = amount * (interest / 100);
           System.out.println("An amount of " + amount + " will give an interest of " +
                   interest + " will give an interestamount of " + interestAmount);

       }


    }

}
