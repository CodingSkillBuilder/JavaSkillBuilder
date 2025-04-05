import java.util.Arrays;

public class Point extends LandMark implements Mappable{


    private double[] coordinates;

    @Override
    public void render() {
        System.out.println(getName() + "Is marked in the coordinates of: " + Arrays.toString(coordinates));
    }

    public Point(String name, double[] coordinates) {
        super(name);
        this.coordinates = coordinates;
    }
}


class Park extends Point {


    public static void addPark(String name, double[] coordinates){

    }
    private Park(String name, double[] coordinates) {
        super(name, coordinates);
    }


}
