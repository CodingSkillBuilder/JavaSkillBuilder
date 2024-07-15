public class GasPoweredCar extends Car{
    private double aveKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
        this.aveKmPerLitre = 15.5;
        this.cylinders = 100;
    }
}
