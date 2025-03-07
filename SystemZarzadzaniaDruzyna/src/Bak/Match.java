package Bak;

class Match implements Displayable {
    private Team team1;
    private Team team2;
    private String result;

    public Match(Team team1, Team team2, String result) {
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mecz: " + team1.teamName + " vs " + team2.teamName + ", Wynik: " + result);
    }
}