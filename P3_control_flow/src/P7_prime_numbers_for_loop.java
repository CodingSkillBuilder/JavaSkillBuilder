public class P7_prime_numbers_for_loop {
    public static void main(String[] args) {
        int numberPrime = 89;
       System.out.println("This is " + (prime(numberPrime) ? "" : "not") +
               " a prime number");

    }

    public static boolean prime(int number){
        boolean is_prime = false;
        if (number >= 0 ){
            if ((number == 0) || (number == 1) || (number == 2)){
                if (number == 2) is_prime = true;
            } else {
                is_prime = true;
                for (int i = 2; i <= (number / 2); i++) {
                    if (number % i == 0){
                        is_prime = false;
                        break;
                    }
                }
            }
        } else {
            System.out.println("Please enter a positive number");
        }
        return is_prime;
    }
}
