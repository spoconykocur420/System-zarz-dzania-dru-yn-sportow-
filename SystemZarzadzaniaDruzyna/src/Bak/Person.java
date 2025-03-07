package Bak;

abstract class Person implements Displayable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayInfo() {
        System.out.println("Imię: " + name + ", Wiek: " + age);
    }
}
