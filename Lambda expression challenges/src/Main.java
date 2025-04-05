import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Consumer<String> printTheParts = (sentence) -> {
            String[] parts = sentence.split(" ");
            for (String part: parts){
                System.out.println(part);
            }
        };

        printTheParts.accept("Let's split this up into an array");

        Consumer<String> printThePartsAdv = (sentence) -> {
            List<String> parts = Arrays.asList(sentence.split(" "));
            parts.forEach(S -> System.out.println(S));
        };
        System.out.println("________");
        printThePartsAdv.accept("Let's split this up into an array");

        UnaryOperator<String> anotherLambda = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(anotherLambda.apply("1234567890"));

        everySecondCharacter(anotherLambda, "1234567890");

        Supplier<String> iLoveJava = () -> "I love java";
        System.out.println(iLoveJava.get());


    }

    public static void everySecondCharacter(UnaryOperator<String> operators, String value){
        System.out.println(operators.apply(value));
    }





}