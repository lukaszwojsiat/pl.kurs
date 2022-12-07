package pl.kurs.zadanie3.models;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String pesel;
    private String city;

    public Person() {
    }

    public Person(String firstName, String lastName, String pesel, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.city = city;
    }

    public abstract double getIncome();

    public String getPlec() {
        if (pesel.charAt(9) == 0 || pesel.charAt(9) % 2 == 0)
            return "Woman";
        else
            return "Man";
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
