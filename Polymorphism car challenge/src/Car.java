public class Car {
    private String description;

    public void startEngine(){
        System.out.println("Engine is Starting");
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Engine is running");
    }

    protected Car(String description){
        this.description = description;
    }


}
