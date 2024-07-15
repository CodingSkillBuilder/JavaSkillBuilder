import java.util.Scanner;
public class P11_scannerIntro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("When were you born?: ");
        int age = 2024 - scanner.nextInt();

        System.out.println("Hi " + name);
        System.out.println("Hope you know that you are " + age + " years old.");

    }
}
