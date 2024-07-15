public class HybridCar extends Car{

    private double aveKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double aveKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.aveKmPerLitre = aveKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
}
