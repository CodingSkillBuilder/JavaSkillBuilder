public class ElectricCar extends Car{
    private double aveeKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double aveeKmPerCharge, int batterySize) {
        super(description);
        this.aveeKmPerCharge = 500;
        this.batterySize = 100000;
    }
}
