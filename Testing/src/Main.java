public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Try programiz.pro");
        int cat = 87;
        int newCat = cat++;
        int anotherCat = cat;
        System.out.println(newCat);
        System.out.println(anotherCat);
    }
}

class Cat{
    protected static String meow = "Meow";
}

class Dog extends Cat{
    protected static String woof = "woof";
    public static String thisDog(){
        String bus = meow+ " meoooow";
        return meow;
    }
}