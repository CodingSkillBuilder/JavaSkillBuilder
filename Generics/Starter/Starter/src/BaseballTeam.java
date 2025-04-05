import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {


    private final String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer player){
        if (! teamMembers.contains(player)){ // Mind that the record will be using the equals method
            teamMembers.add(player);            // to check the similarity
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + ": ");
        System.out.println(teamMembers);
    }

    public int ranking(){

        return (totalLosses * 2) + totalTies + 1; // To make the ranking 1 or greater thane one.
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore){
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;
    }

    @Override
    public String toString() {
        return teamName + "(Ranked " + ranking() + ")";
    }
}
