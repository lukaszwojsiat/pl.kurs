package pl.kurs.exercise3.services;

import pl.kurs.exercise3.models.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePersons {

    public Person[] createNPersons(int n) {
        Person[] personsArray = new Person[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("==Tworzenie osób: " + (i + 1) + "/" + n + ". Podaj imię: ");
            String firstName = scanner.nextLine();

            System.out.println("==Tworzenie osób: " + (i + 1) + "/" + n + ". Podaj nazwisko: ");
            String lastName = scanner.nextLine();

            System.out.println("==Tworzenie osób: " + (i + 1) + "/" + n + ". Podaj pesel: ");
            String pesel = scanner.nextLine();

            personsArray[i] = new Person(firstName, lastName, pesel);
        }
        scanner.close();
        return personsArray;
    }

    public Person[] getOneSexPersons(Person[] personsArray, String sex) {
        if (personsArray == null) {
            System.out.println("Nie dostarczono tablicy!");
            return null;
        }

        Person[] newArray = new Person[personsArray.length];
        int count = 0;

        if (sex.equalsIgnoreCase("male"))
            for (Person person : personsArray) {
                if (person.getPeselNumber().length() != 11) {
                    System.out.println("Dostarczono zły PESEL osoby " + person.getFirstName() + " " + person.getLastName() + "!");
                    return null;
                }
                if (person.getPeselNumber().charAt(9) % 2 != 0)
                    newArray[count++] = person;
            }
        else if (sex.equalsIgnoreCase("female"))
            for (Person person : personsArray) {
                if (person.getPeselNumber().length() != 11) {
                    System.out.println("Dostarczono zły PESEL osoby " + person.getFirstName() + " " + person.getLastName() + "!");
                    return null;
                }
                if (person.getPeselNumber().charAt(9) % 2 == 0)
                    newArray[count++] = person;
            }
        else {
            System.out.println("Nie rozpoznano płci!");
            return null;
        }

        Person[] finalArray = new Person[count];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = newArray[i];
        }
        return finalArray;
    }
}
