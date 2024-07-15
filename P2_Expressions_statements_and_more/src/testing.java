public class testing {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1111));

    }

    public static boolean isPalindrome(int number){
        if (number < 0){
            number = -number;
        }
        int numberLoop = number;
        int newNumber = 0;
        int last = 0;
        while (numberLoop > 0){
            last = numberLoop % 10;
            newNumber = (newNumber * 10) + last;
            numberLoop = numberLoop / 10;

        }

        if (newNumber == number){
            return true;
        } else {
            return false;
        }
    }


}
