package Bak;

import java.util.Scanner;

class Player extends Person implements Trainable {
    private Position position;

    public Player(String name, int age, Position position) {
        super(name, age);
        this.position = position;
    }

    public static Player createPlayer(Scanner scanner) {
        System.out.print("Podaj imię zawodnika: ");
        String name = scanner.nextLine();

        int age;
        while (true) {
            System.out.print("Podaj wiek zawodnika: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine();
                if (age > 0) break;
            }
            System.out.println("Nieprawidłowy wiek. Spróbuj ponownie.");
            scanner.nextLine();
        }

        Position position;
        while (true) {
            System.out.print("Podaj pozycję zawodnika (GOALKEEPER, DEFENDER, MIDFIELDER, FORWARD): ");
            try {
                position = Position.valueOf(scanner.nextLine().toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Nieprawidłowa pozycja. Spróbuj ponownie.");
            }
        }

        return new Player(name, age, position);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pozycja: " + position);
    }

    @Override
    public void train() {
        System.out.println(name + " trenuje intensywnie!");
    }

    @Override
    public void rest() {
        System.out.println(name + " odpoczywa po treningu.");
    }
}
