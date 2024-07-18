public class Building extends Construction {

    public String label(){
        return "Sydney Town Hall";
    }

    public Type geometryType(){
        return Type.POINT;
    }

    public Marker iconType(){
        return Marker.DOT;
    }

    public void exporter(){

        String export = String.format(toExport, geometryType(), label(), iconType(), getName(), getUtilityType());
        toJSON(export);
    }

    public void toJSON(String information){
        super.toJSON(information);
    }
    public Building(String name, String utility){
        super(name, utility);
    }
}
