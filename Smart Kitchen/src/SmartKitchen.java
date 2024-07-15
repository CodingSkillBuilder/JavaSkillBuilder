public class SmartKitchen {

    private Refrigerator refrigerator;
    private  DishWasher dishWasher;
    private  CoffeeMaker coffeeMaker;

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void purMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void LoadDishwasher(){
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean refrigerator, boolean dishwasher, boolean coffeemaker){
        this.refrigerator.setHasWorkToDo(refrigerator);
        this.dishWasher.setHasWorkToDo(dishwasher);
        this.coffeeMaker.setHasWorkToDo(coffeemaker);
    }

    public SmartKitchen(){
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

}
