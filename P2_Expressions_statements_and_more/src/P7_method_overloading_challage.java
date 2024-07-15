public class P7_method_overloading_challage {
    public static void main(String[] args) {

    }


    public static String getDurationString(int mins, int seconds){
        if ((mins < 0) || (seconds < 0) || (seconds > 60)){
            if ((seconds < 0) || (seconds > 60)) {
                return "Invalid second count";
            }
            //if (mins < 0) {
                return "Invalid minute count";
            //}
        } else {
            int totalSeconds = (mins * 60) + seconds;
            String display = getDurationString(totalSeconds);
            return display;
        }


    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            int hours = seconds % 3600;
            int mins = (seconds - (hours * 3600)) % 60;                             //wrong logic
            int secs = seconds - ((hours * 3600) + (mins * 60));
            String display = hours + "h " + mins + "m " + secs + "s";
            return display;

        } else {
            return "Invalid second count";
        }



    }
}
