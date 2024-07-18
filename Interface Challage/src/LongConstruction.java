public class LongConstruction extends Construction {

    public String label(){
        return "College St (Fiber optics)";
    }

    public Type geometryType(){
        return Type.LINE;
    }

    public Marker iconType(){
        return Marker.DLINE;
    }
    public LongConstruction(String name, String utility){
        super(name, utility);
    }

    public void exporter(){
        String export = String.format(toExport, geometryType(), label(), iconType(), getName(), getUtilityType());
        toJSON(export);
    }

    public void toJSON(String information){
        super.toJSON(information);
    }
}
