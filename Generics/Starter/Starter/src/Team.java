import java.util.ArrayList;
import java.util.List;




record Affiliation(String city, String State){}


public class Team<T extends Player, S> {


    private final String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T player){
        if (!teamMembers.contains(player)){ // Mind that the record will be using the equals method
            teamMembers.add(player);            // to check the similarity
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + ": ");
        System.out.println(affiliation != null ? "Affiliation: " + affiliation :"");
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
        return teamName + "(Ranked " + ranking() + ") \n"
                 + "(Affiliation: " + affiliation + ")";
    }
}
