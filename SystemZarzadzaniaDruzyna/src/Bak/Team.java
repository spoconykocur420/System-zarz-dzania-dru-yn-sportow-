package Bak;

import java.util.ArrayList;
import java.util.List;

class Team implements Displayable, TeamManagement {
    String teamName;
    private List<Player> players;
    private Coach coach;

    public Team(String teamName, Coach coach) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.coach = coach;
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void removePlayer(String playerName) {
        if (players.removeIf(player -> playerName.equalsIgnoreCase(player.name))) {
            System.out.println("Zawodnik " + playerName + " został usunięty z drużyny.");
        } else {
            System.out.println("Nie znaleziono zawodnika o imieniu " + playerName + ".");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Drużyna: " + teamName);
        coach.displayInfo();
        for (Player player : players) {
            player.displayInfo();
        }
    }
}