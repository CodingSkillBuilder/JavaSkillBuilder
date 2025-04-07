import java.util.Comparator;

class GPAComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGpa() + "" + o1.getId()).compareTo(o2.getGpa() + "" + o2.getId());
    }
}





public class Student implements Comparable<Student>{

    private static int ID = 1000;
    private String name;
    private Integer id;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String name){
        this.name = name;
        id = ID++;
        gpa = Math.random() * 4;
    }





    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }


//    @Override
//    public int compareTo(Object o) {
//
//        String theirName = ((Student) o).name;
//
//        return this.name.compareTo(theirName);
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
}
