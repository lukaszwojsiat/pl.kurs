package pl.kurs.zadanie3.models;

public class Student extends Person {
    private int group;
    private double scholarship;

    public Student() {
    }

    public Student(String firstName, String lastName, String pesel, String city, int group, double scholarship) {
        super(firstName, lastName, pesel, city);
        this.group = group;
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", group='" + group + '\'' +
                ", scholarship='" + scholarship + '\'' +
                "} ";
    }
}
