public class CoffeeMaker {
    private boolean hasWorkToDo;

    public CoffeeMaker(){
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        System.out.println("Device: Coffee Maker");
        if (hasWorkToDo){
            System.out.println("Processing...");
        } else {
            System.out.println("Please assign work...");
        }
    }
}
