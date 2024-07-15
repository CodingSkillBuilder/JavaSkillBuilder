public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(){
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes(){
        System.out.println("Device: Dish Washer");
        if (hasWorkToDo){
            System.out.println("Processing...");
        } else {
            System.out.println("Please assign work...");
        }
    }
}
