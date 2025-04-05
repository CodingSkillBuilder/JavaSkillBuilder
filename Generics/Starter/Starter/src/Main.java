

// Quick note about records here

/*
Mind that records,
    have final attributes only.
    All though it is possible to create general looking instance field it is super discouraged

Mind that records can,
   have methods (that will not attempt to the fields inside the records)
   can implement interface

Mind that methods can't,
    Mind that methods can't have a setter or any other methods that can change the fields declared
        (this is cause that attributes in a records are implicitly final (immutable))
    extend or be extended

 */


record BaseballPlayer(String name, String position){}



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


}