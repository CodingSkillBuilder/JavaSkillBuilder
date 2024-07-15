public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student = new Student("Alex", "w12345");
        System.out.println(student.getName());
        student.setName("Akash");
        System.out.println(student.getName());
    }
}