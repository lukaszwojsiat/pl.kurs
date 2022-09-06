package pl.kurs.exercise3.app;

import pl.kurs.exercise3.models.Person;
import pl.kurs.exercise3.services.CreatePersons;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        CreatePersons createPersons = new CreatePersons();
        Person[] personArray = createPersons.createNPersons(4);

        Person[] maleArray = createPersons.getOneSexPersons(personArray, "MALE");
        Person[] femaleArray = createPersons.getOneSexPersons(personArray, "FEMALE");

        System.out.println(Arrays.toString(maleArray));
        System.out.println(Arrays.toString(femaleArray));
    }
}
