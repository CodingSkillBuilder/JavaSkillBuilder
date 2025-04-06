public class Student implements Comparable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    @Override
    public int compareTo(Object o) {

        String theirName = ((Student) o).name;

        return this.name.compareTo(theirName);
    }
}
