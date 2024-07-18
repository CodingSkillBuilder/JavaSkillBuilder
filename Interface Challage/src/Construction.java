public abstract class Construction implements Mappable{
    private final String name;
    private final String utilityType;

    public String getName() {
        return name;
    }

    public String getUtilityType() {
        return utilityType;
    }



    public Construction(String name, String utilityType) {
        this.name = name;
        this.utilityType = utilityType;
    }
}
