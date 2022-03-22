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

    void addTeamToLeague(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " already exists in league.");
        } else {
            teams.add(team);
        }
    }

    void printTable() {
        Collections.sort(teams);
        System.out.println(name + " standings");
        System.out.println("--------------------------");
        for (Team team : teams) {
            System.out.println(team.getName() + " (" + team.getPoints() + ")");
        }
    }
}
