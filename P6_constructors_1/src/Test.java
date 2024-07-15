public class Test {
    private int numberOne;
    private int numberTwo;
    private int numberThree;

    public Test(int numberOne, int numberTwo, int numberThree){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
    }

    public Test(){
        this(1, 2, 3);
    }

    public Test(int numberOne, int numberThree){
        this(numberOne, 2, numberThree);
    }

    public static void cool(Test personal){
        System.out.println(personal.numberOne);
        System.out.println(personal.numberThree);
        System.out.println(personal.numberTwo);
    }

}
