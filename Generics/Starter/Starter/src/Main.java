

// Quick note about records here

/*
Mind that records,
    have final attributes only.
    All though it is possible to create general looking instance field it is super discouraged

Mind that records can,
   have methods (that will not attempt to the fields inside the records)
   can implement interface
   Yes! You can define overloaded constructors, but even then — you must assign all the final fields.

Mind that methods can't,
    Mind that methods can't have a setter or any other methods that can change the fields declared
        (this is cause that attributes in a records are implicitly final (immutable))
    extend or be extended

 */
interface Player{}

record BaseballPlayer (String name, String position) implements Player{}
record FootballPlayer (String name, String position) implements Player{}



public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");



        setScores(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);

        phillies.listTeamMembers();



        Team<BaseballPlayer> baseBallTeam = new Team<>("Base ballers");
        Team<FootballPlayer> footBallTeam = new Team<>("Foot ballers");

        baseBallTeam.addTeamMember(new BaseballPlayer("Base baller", "Left fielder"));
        footBallTeam.addTeamMember(new FootballPlayer("Base baller", "Left fielder"));

        baseBallTeam.listTeamMembers();
        footBallTeam.listTeamMembers();

    }


    public static void setScores(
            BaseballTeam teamOne,
            int teamOneScore,
            BaseballTeam teamTwo,
            int teamTwoScore
    ){
        String message = teamOne.setScore(teamOneScore, teamTwoScore);
        teamTwo.setScore(teamTwoScore, teamOneScore);
        System.out.printf("%s, %s, %s %n",teamOne,  message, teamTwo);
    }
    public static void setScores(
            Team teamOne,
            int teamOneScore,
            Team teamTwo,
            int teamTwoScore
    ){
        String message = teamOne.setScore(teamOneScore, teamTwoScore);
        teamTwo.setScore(teamTwoScore, teamOneScore);
        System.out.printf("%s, %s, %s %n",teamOne,  message, teamTwo);
    }


}