package BAK;

class Coach extends Person {
    String specialization;

    public Coach(String firstName, String lastName, String specialization) {
        super(firstName, lastName);
        this.specialization = specialization;
    }
}
