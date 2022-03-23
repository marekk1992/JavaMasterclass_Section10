package exercises.genericsChallenge;

public class Main {

    public static League<FootballTeam> premierLeague;
    public static League<BasketballTeam> nba;

    public static void main(String[] args) {
        FootballTeam arsenal = new FootballTeam("Arsenal", 54);
        FootballTeam liverpool = new FootballTeam("Liverpool", 69);
        FootballTeam chelsea = new FootballTeam("Chelsea", 59);

        BasketballTeam lakers = new BasketballTeam("Los Angeles Lakers", 15);
        BasketballTeam clippers = new BasketballTeam("Los Angeles Clippers", 22);
        BasketballTeam heat = new BasketballTeam("Miami Heat", 35);

        premierLeague = new League<>("English Premier League");
        premierLeague.addTeamToLeague(arsenal);
        premierLeague.addTeamToLeague(liverpool);
        premierLeague.addTeamToLeague(chelsea);
        premierLeague.printTable();

        nba = new League<>("NBA");
        nba.addTeamToLeague(lakers);
        nba.addTeamToLeague(clippers);
        nba.addTeamToLeague(heat);
        nba.printTable();
    }
}
