public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Building building = new Building("Sydney Town hall", "Government");
        LongConstruction longConstruction = new LongConstruction("Collage St", "Fiber Optic");
        building.exporter();
        longConstruction.exporter();
    }
}