public class Topings {
    private String type;
    private int plusPrice;

    public String getType() {
        return type;
    }

    public int getPlusPrice() {
        return plusPrice;
    }

    public static Object topingFactory(String type, int size){

        return switch (type){
            case "C" -> new Topings("Cheese", (size * 5));
            case "E" -> new Topings("Egg", (size * 4));
            case "O" -> new Topings("Onions", (size * 2));
            case "M" -> new Topings("Mushrooms", (size * 3));
            case "K" -> new Topings("Kimchi", (size * 3));
            case "S" -> new Topings("Sauce", (size * 1));
            case "G" -> new Topings("Guacamole", (size * 4));
            default -> "Error creating the toping";
        };

    }


    public Topings(String type, int plusPrice) {
        this.type = type;
        this.plusPrice = plusPrice;
    }
}
