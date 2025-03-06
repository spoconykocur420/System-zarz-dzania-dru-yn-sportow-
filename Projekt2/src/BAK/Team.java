package BAK;

import java.util.ArrayList;
import java.util.List;

class Team {
    String name;
    List<Player> players;
    List<Match> matches;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void displayPlayers() {
        System.out.println("Zawodnicy w drużynie " + name + ":");
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void displayMatches() {
        System.out.println("Historia meczów drużyny " + name + ":");
        for (Match m : matches) {
            System.out.println(m);
        }
    }
}
