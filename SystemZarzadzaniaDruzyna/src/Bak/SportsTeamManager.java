package Bak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsTeamManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();

        System.out.print("Podaj nazwę drużyny: ");
        String teamName = scanner.nextLine();
        System.out.print("Podaj imię trenera: ");
        String coachName = scanner.nextLine();
        System.out.print("Podaj wiek trenera: ");
        int coachAge = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Podaj strategię trenera: ");
        String strategy = scanner.nextLine();
        Coach coach = new Coach(coachName, coachAge, strategy);

        Team team = new Team(teamName, coach);


        team.addPlayer(new Player("Robert Lewandowski", 34, Position.FORWARD));
        team.addPlayer(new Player("Kamil Glik", 36, Position.DEFENDER));
        team.addPlayer(new Player("Wojciech Szczęsny", 33, Position.GOALKEEPER));
        team.addPlayer(new Player("Adam Małysz", 19, Position.FORWARD));
        team.addPlayer(new Player("Kamil Stoch", 37, Position.DEFENDER));
        team.addPlayer(new Player("Wojciech Sosna", 38, Position.MIDFIELDER));
        team.addPlayer(new Player("Tomasz Włodarczyk", 34, Position.FORWARD));
        team.addPlayer(new Player("Kamil Bednarek", 50, Position.DEFENDER));
        team.addPlayer(new Player("Robert Palikot", 23, Position.MIDFIELDER));
        team.addPlayer(new Player("Ryszard Lis", 34, Position.FORWARD));
        team.addPlayer(new Player("Kamil klik", 17, Position.DEFENDER));
        team.addPlayer(new Player("Michał Paź", 33, Position.GOALKEEPER));
        team.addPlayer(new Player("Borys Lew", 23, Position.FORWARD));
        team.addPlayer(new Player("Zdzisław Sroka", 22, Position.DEFENDER));
        team.addPlayer(new Player("Adam Kruk", 23, Position.MIDFIELDER));

        System.out.print("Czy chcesz dodać nowego zawodnika? (tak/nie): ");
        if (scanner.nextLine().equalsIgnoreCase("tak")) {
            Player newPlayer = Player.createPlayer(scanner);
            team.addPlayer(newPlayer);
        }

        teams.add(team);
        System.out.println("Zespół został pomyślnie utworzony!");
        team.displayInfo();

        System.out.print("Czy chcesz usunąć zawodnika? (tak/nie): ");
        if (scanner.nextLine().equalsIgnoreCase("tak")) {
            System.out.print("Podaj imię zawodnika do usunięcia: ");
            String playerName = scanner.nextLine();
            team.removePlayer(playerName);
            team.displayInfo();
        }
    }
}
