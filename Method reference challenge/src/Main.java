import java.util.Random;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        UnaryOperator<String> testing = String::toUpperCase;

        System.out.println(testing.apply("this is me"));

        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat newKitten = Cat.breedCat(catOne, catTwo, ThisNewCat::catter);

    }
}

interface ThisNewCat<T extends Cat>{
    T catter(T catOne, T CatTwo);
}

class Animal{

    static Random random = new Random();
    int age;
    String name;

    public Animal(){
        name = GenerateName();
        age = random.nextInt(1, 11);


    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static String GenerateName(){
        StringBuilder toReturn = new StringBuilder();
        for(int i = 0; i < 5; i++){
            toReturn.append((char) random.nextInt(97, 114));
        }
        return String.valueOf(toReturn);
    }

}

class Cat extends Animal implements ThisNewCat{
    Fur furType;

    public Cat(){
        furType = Fur.getFur();
    }

    public Cat(Cat catOne, Cat catTwo){
        this();
        name = catOne.name  + "'s and" + catTwo.name + "'s kitty";
        age = 0;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "furType=" + furType +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //try to make the program work in such a way that you can use method references to return an actual newborn cat Object.
    public static Cat breedCat(Cat catOne, Cat catTwo, ThisNewCat<Cat> algo){
        return algo.catter(catOne, catTwo);
    }

    @Override
    public Cat catter(Cat catOne, Cat CatTwo) {
        return null;
    }
}

enum Fur{
    Tiger, Ginger, Gray, White, Black, MixColor;
    static Fur getFur(){
        Fur[] fur = Fur.values();
        return fur[new Random().nextInt(0, 7)];
    }
}