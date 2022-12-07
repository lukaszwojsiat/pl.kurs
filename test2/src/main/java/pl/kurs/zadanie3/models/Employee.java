package pl.kurs.zadanie3.models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String pesel, String city, String position, double salary) {
        super(firstName, lastName, pesel, city);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                "}";
    }
}
