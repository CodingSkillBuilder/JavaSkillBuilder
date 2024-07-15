public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //11 before !
        String cat = padLeft("cat", 8);
        System.out.printf(cat);
    }

    public static String padLeft(String original, int length){
        int remain = length - original.length();
        String toExport = "";
        if (remain >= 0){
            toExport = String.format("%1$" + length + "s",original);
            return toExport;
        } else {
            toExport = original.substring(0, length);
            return toExport;
        }

    }
}