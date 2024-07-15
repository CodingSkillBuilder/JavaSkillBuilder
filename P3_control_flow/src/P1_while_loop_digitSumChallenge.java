public class P1_while_loop_digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(11111));
    }
    public static int sumDigits(int number){
        if (number >= 0) {
            String strNumber = "" + number;
            int length = strNumber.length();
            int sum = 0;
            for (int i = 0; i < length; i++) {
                sum += Integer.parseInt(strNumber.substring(i, (i + 1)));
            }
            return sum;
        }else{
            return -1;
        }
    }
}
