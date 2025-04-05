import java.util.Comparator;

public class Student implements Comparable<Student>{

    private static int ID_Last = 1000;
    private final String name;
    private final int id;
    private final double GPA;

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
        id = ID_Last++;
    }

    @Override
    public int compareTo(Student o){
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", GPA=" + GPA +
                "}\n";
    }
}

class GPA_Comparator implements Comparator<Student>{
    public int compare(Student student1, Student student2){
        return (student1.getGPA() + student1.getName()).compareTo(student2.getGPA() + student2.getName());
//        return 1;
    }
}

//class TestNow implements Comparable<String>{
//    int name;
//    public int compareTo(String cat){
//        return -1;
//    }
//}
