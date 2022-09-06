package pl.kurs.exercise3.models;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String peselNumber;

    public Person() {
    }

    public Person(String firstName, String lastName, String peselNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselNumber = peselNumber;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselNumber='" + peselNumber + '\'' +
                '}';
    }
}
