public class P6_method_overloading_challange {
    public static void main(String[] args) {
        System.out.println(totalInches(5, 7));
    }

    public static double InchToCm(int length){
        double lengthInCms = length * 2.54;
        return lengthInCms;
    }

    public static double totalInches(int foots, int inches){
        double totalInch = InchToCm(((foots * 12) + inches));
        return totalInch;

    }
}
