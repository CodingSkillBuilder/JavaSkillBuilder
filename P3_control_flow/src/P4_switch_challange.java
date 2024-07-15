public class P4_switch_challange {
    public static void main(String[] args) {
        String letter = "A";
        switch (letter){
            case "A":
                System.out.println("Able");
                break;
            case "B":
                System.out.print("Baker");
                break;
            case "C":
                System.out.println("Charlie");
                break;
            case "D":
                System.out.println("Charlie");
                break;
            case "E":
                System.out.println("Easy");
                break;
            default:
                System.out.println(letter + "Letter not recognised");
                break;
        }
    }
}
