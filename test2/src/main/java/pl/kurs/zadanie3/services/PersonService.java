package pl.kurs.zadanie3.services;

import pl.kurs.zadanie3.models.Person;

public class PersonService {

    public static Person findPersonWithBiggestIncome(Person... person) {
        Person foundPerson = null;
        double income = 0;
        for (Person p :
                person) {
            if (p != null)
                if (p.getIncome() > income) {
                    income = p.getIncome();
                    foundPerson = p;
                }
        }
        return foundPerson;
    }

    public static int howManyWoman(Person... person) {
        int womanCounter = 0;
        for (Person p :
                person) {
            if (p != null)
                if (p.getPlec().equals("Woman"))
                    womanCounter++;
        }
        return womanCounter;
    }
}
