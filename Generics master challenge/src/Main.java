import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Random random = new Random();
        int x = random.nextInt(0, 10);
        System.out.println(x);
    }
}