public abstract class Objects implements flyable{
    public static void doShit(){
        System.out.println("This is a shitty demo");
        System.out.println();
    }

}

interface flyable {
    String cat = "I'm a cat";
    void powerBoost();
}


class newTest extends Objects{
    @Override
    public void powerBoost(){

    }

    public static void moreCode(){
        System.out.println("The more code method was accessible");
    }
    public void messUP(){

    }

}