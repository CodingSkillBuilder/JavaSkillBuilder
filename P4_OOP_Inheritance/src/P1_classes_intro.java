public class P1_classes_intro {

    private String brand;
    private String model;
    private int engines;
    private int seates;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngines() {
        return engines;
    }

    public int getSeates() {
        return seates;
    }

    public void planes(){
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("engines: " + engines);
        System.out.println("seates: "+ seates);
    }
}
