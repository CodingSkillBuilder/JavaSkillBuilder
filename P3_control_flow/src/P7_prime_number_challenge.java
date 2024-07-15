public class P7_prime_number_challenge {
    public static void main(String[] args) {
        int begin = 0;
        int end = 10;
        int counter = 0;
        for (; begin < end; begin ++){ //this is a good point
            boolean isPrime = prime(begin);
            if (isPrime){
                System.out.println(begin + " is a prime number.");
                counter ++;
                if (counter >= 3) break;
            }

        }
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
