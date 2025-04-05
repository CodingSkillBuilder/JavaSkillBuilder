import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student[] studentList = {
            new Student("Heather", 3.2),
            new Student("Akash", 3.6),
            new Student("Anne", 2.5)
        };

        System.out.println(Arrays.toString(studentList));
        Arrays.sort(studentList);
        System.out.println(Arrays.toString(studentList));
        Comparator<Student> comparator = new GPA_Comparator();
//        Arrays.sort(studentList, comparator);
//        System.out.println(Arrays.toString(studentList));
//        Arrays.sort(studentList,comparator.reversed());
//        System.out.println(Arrays.toString(studentList));
    }
}

