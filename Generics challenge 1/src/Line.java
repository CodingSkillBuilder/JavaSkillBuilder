import java.util.Arrays;

public class Line extends LandMark implements Mappable{

    private double[][] coordinates;
    @Override
    public void render() {
        System.out.println(getName() + "Is marked in the coordinates of: " + Arrays.deepToString(coordinates));
    }

    public Line(String name, double[][] coordinates) {
        super(name);
        this.coordinates = coordinates;
    }
}


class River extends Line{
    public River(String name, double[][] coordinates) {
        super(name, coordinates);
    }
}
