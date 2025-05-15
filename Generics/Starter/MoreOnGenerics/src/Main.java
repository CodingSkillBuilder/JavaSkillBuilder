import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int studentCount = 10;

        List<Student> students = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            students.add(new Student());
        }

        printList(students);


        List<Student> LPAStudents = new ArrayList<>();
        for(int i = 0; i < studentCount; i++){
            LPAStudents.add(new LPAStudent());
        }

        printList(LPAStudents);


    }


    public static <T extends Student> void printList(List<T> students){
        for(var student: students){
            System.out.println(student);
        }
        System.out.println();
    }

    public static void printListVersion2(List<? extends Student> students){
        for(var student: students){
            System.out.println(student);
        }
        System.out.println();
    }

}
