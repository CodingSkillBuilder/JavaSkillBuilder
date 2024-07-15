public class Drinks extends Products{

    private String type;


    public String getType() {
        return type;
    }

    public static Object drinkFactory(String type, int size){
        return switch (type){
            case "C" -> new Drinks("CreamSoda", size, (size * 3));
            case "S" -> new Drinks("Sprite", size, (size * 1));
            case "F" -> new Drinks("Fanta", size, (size * 2));
            case "L" -> new Drinks("Lime", size, (size * 3));
            default -> "Error making the drink";
        };
    }

    private Drinks(String type, int size, double price) {
        super(price, size);
        this.type = type;
    }
}
