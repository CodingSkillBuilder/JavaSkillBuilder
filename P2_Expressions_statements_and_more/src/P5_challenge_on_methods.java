public class P5_challenge_on_methods {
    public static void main(String[] args) {
        double marks = 1200;
        String player = "Tim";
        int rank = calculateHighScorePosition(marks);
        displayHighScorePosition(player, rank);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " +
                position + " on the high score list");
    }

    public static int calculateHighScorePosition(double score) {
        if (score >= 1000){
            return 1;
        }else if (score >= 500){
            return 2;
        }else if (score >= 100){
            return 3;
        }else {
            return 4;
        }

    }
    
}
