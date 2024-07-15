public class P3_even_more_on_switch {
    public static void main(String[] args) {
        System.out.print(month_2("january"));
    }

    public static String month_1(String month){
        switch (month) {
            case "january":
            case "february":
            case "march":
            case "april":
                return "1st";
            case "may":
            case "june":
            case "july":
            case "august":
                return "2nd";
            case "september":
            case "october":
            case "november":
            case "december":
                return "3rd";
            default:
                return "Invalid month";
        }
    }

    public static String month_2(String month){
        return switch (month){
            case "january", "february", "march", "april" -> "1st";
            case "may", "june", "july", "august" -> "2nd";
            case "september", "october", "november", "december" -> "3rd";
            default -> "Invalid month";   //in the enhanced switch there should always be default or it would rise an error

        };  //mind that we should put a ";" at the end of the return switch...
    }           // as a matter of fact return switch it self is a  return statement.
}           // if incase we have to return a value we could use the "yield" keyword
                //learn about it more in mydocs