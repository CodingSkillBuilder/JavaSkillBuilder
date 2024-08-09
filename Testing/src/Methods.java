import java.util.ArrayList;
import java.util.Arrays;

public class Methods {


    public static void main(String[] args) {
        int [][] cat = {{1, 2}, {1, 2}};
        int [][][] thisCat = {{{1, 2}}, {{1, 2}}};
        int [] anotherCat = {1, 2, 4};
        int fog = 1;

        System.out.println(Arrays.deepToString(thisCat));

        Thisrec plane = new Thisrec(123, "sajdfnilajf");


        anotherMain(anotherCat);
    }


    public static void anotherMain(int[]... thisCat){
        System.out.println(Arrays.toString(thisCat));
    }


}


record Thisrec(int plane, String cute) {

}