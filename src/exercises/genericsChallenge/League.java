package exercises.genericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;

    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public void addTeamToLeague(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " already exists in league.");
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to " + name);
        }
    }

    public void printTable() {
        if (teams.isEmpty()) {
            System.out.println("There are no teams in " + name);
        } else {
            Collections.sort(teams);
            System.out.println(name + " standings");
            System.out.println("--------------------------");
            for (Team team : teams) {
                System.out.println(team.getName() + " (" + team.getPoints() + ")");
            }
        }
    }
}
