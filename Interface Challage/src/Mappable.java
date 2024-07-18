public interface Mappable {
    String JSON_PROPERTY = "\"properties\":{%s}";

    String toExport = "\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\", \"name\": \"%s\", \"utility\": \"%s\",";
    String label();

    Type geometryType();

    Marker iconType();

    void exporter();

    default void toJSON(String information){
        String toPrint = String.format(JSON_PROPERTY, information);
        System.out.println(toPrint);
    }
}
