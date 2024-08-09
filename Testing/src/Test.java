public class Test extends anotherTest{
    public static void main(String[] args) {
        String cat = String.format("%s is a cute cat", cute.CAT);
        System.out.println(cat);
        System.out.println(cute.CAT);
    }


    @Override
    public void cat(){
        super.cat();
    }
}


enum cute {
    CAR,CAT,BABY,DOG;
}

class anotherTest{
    public void cat(){
        System.out.println("Print that im a cat");
    }
}
