import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        cute(1, 2, 3, 5); //as many as parameters you want or a list
        int[] thisCat = {1, 5, 9};
        cute(thisCat);


    }


    public static void cute(int... cat){
        System.out.println(cat);
        System.out.println(Arrays.toString(cat));
    }
}