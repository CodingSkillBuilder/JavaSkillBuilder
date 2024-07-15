public class P8_five_and_three {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= 1000; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + " is divisible by both 3 & 5.");
                sum += i;
                count++;
                if (count > 5){
                    System.out.println("The sum is: " + sum);
                    break;
                }

            }
        }
    }

}
