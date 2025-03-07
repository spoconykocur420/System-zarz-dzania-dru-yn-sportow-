package Bak;

class Coach extends Person {
    private String strategy;

    public Coach(String name, int age, String strategy) {
        super(name, age);
        this.strategy = strategy;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Strategia: " + strategy);
    }
}
