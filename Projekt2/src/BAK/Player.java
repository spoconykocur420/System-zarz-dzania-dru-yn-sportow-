package BAK;

class Player extends Person {
    Position position;
    int age;

    public Player(String firstName, String lastName, Position position, int age) {
        super(firstName, lastName);
        this.position = position;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + position + ", " + age + " lat)";
    }
}