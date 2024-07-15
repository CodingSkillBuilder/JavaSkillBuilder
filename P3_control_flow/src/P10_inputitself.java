public class P10_inputitself {
    public static void main(String[] args) {
        String name = System.console().readLine("what is your name? ");
        //above is a method that we can use when we want to take an input without calling
        // or making any objects...

        int age = Integer.parseInt(System.console().readLine("How old are you? "));
        System.out.println("Hi " + name);
        System.out.println("Hope you know that you are " + age + " years old.");

    }


}
