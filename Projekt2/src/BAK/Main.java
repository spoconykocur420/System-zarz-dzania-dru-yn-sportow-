package BAK;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("FC Java");
        Player player1 = new Player("Jan", "Kowalski", Position.FORWARD, 22);
        Player player2 = new Player("Piotr", "Nowak", Position.DEFENDER, 25);

        team.addPlayer(player1);
        team.addPlayer(player2);
        team.displayPlayers();

        Team opponent = new Team("FC Python");
        Match match = new Match(opponent, LocalDate.of(2024, 3, 10), "3:1");
        team.addMatch(match);
        team.displayMatches();
    }
}