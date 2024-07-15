public class P4_returning_functions {
    public static void main(String[] args) {
        int value = 92;
        boolean calculate = true;
        double finalSum = calculator(calculate, 10, value);
        System.out.println(finalSum);

    }
    public static double calculator(boolean proceed, int statValue, int newValue) {
        // notice that the "void" keyword has been replaced with a data type...(this data type is the return data type of the method)
        if (proceed) {
            int sum = statValue + newValue;
            return sum;
        }
       return -9.9999;
        // notice that there are two return functions...(unlike in python in java not having a return function in every possible paths
        // when there is any other keyword instead of "void" in the method declaration)
    }
}
