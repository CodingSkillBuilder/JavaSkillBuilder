import java.util.ArrayList;


public class Layer<T extends Mappable> {


    private static ArrayList<Mappable> markings = new ArrayList<>();

    public void addElement(T toAdd){
        markings.add(toAdd);
    }

    public void printAll(){
        for (Mappable t: markings){
            t.render();
        }
    }


    public Layer(String name, double[] coordinates){



    }

}


interface Mappable{
    void render();
}

class LandMark{
    private String name;



    public String getName() {
        return name;
    }

    public LandMark(String name) {
        this.name = name;
    }
}