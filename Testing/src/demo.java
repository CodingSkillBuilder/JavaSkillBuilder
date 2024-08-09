import javax.management.monitor.Monitor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class demo {

    public static void main(String[] args) {
        ClassOne ObjOne = new ClassOne(12, 45, "this is a name");

        ClassTwo.catty(ObjOne);

        System.out.println(ObjOne);


        gen<ClassOne> objTwo = new gen<>();
        System.out.println(objTwo);

    }

}


class ClassOne implements Mob{
    private final int firstNumber;
    private final double anotherNumber;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public ClassOne(int firstNumber, double anotherNumber, String name) {
        this.firstNumber = firstNumber;
        this.anotherNumber = anotherNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClassOne{" +
                "firstNumber=" + firstNumber +
                ", anotherNumber=" + anotherNumber +
                ", name='" + name + '\'' +
                '}';
    }
}

interface Mob{}

class ClassTwo{

    public static void catty(ClassOne test){
        test.setName("This is the updated name");
    }

}


class gen<T extends Mob>{

    @Override
    public String toString() {
        return "gen{}" + getClass().getSimpleName();
    }
}


/////////////////////////



















