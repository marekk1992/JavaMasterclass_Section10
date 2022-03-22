package exercises.genericsChallenge;

public abstract class Team implements Comparable<Team>, SportTeam {

    private String name;
    private int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Team team) {
        if (this.getPoints() > team.getPoints()) {
            return -1;
        } else if (this.getPoints() < team.getPoints()) {
            return 1;
        } else {
            return 0;
        }
    }
}
