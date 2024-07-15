public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(){
        hasWorkToDo = false;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        System.out.println("Device: Refrigerator");
        if (hasWorkToDo){
            System.out.println("Processing...");
        } else {
            System.out.println("Please assign work...");
        }
    }


}
