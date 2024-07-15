public class Student {
    private String name;
    private String ID;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public Student(){

    }
}
