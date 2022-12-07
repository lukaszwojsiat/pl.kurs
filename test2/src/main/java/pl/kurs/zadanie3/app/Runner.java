package pl.kurs.zadanie3.app;

import pl.kurs.zadanie3.models.Employee;
import pl.kurs.zadanie3.models.Person;
import pl.kurs.zadanie3.models.Student;
import pl.kurs.zadanie3.services.PersonService;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Łukasz", "Wojsiat", "99082202133", "Gdańsk", 3, 1500);
        Student student2 = new Student("Marek", "Markiewicz", "87112045655", "Gdynia", 3, 1000);
        Student student3 = new Student("Ania", "Lewandowska", "80120523684", "Sopot", 3, 2500);

        Employee employee1 = new Employee("Konrad", "Kondrat", "55100135456", "Warszawa", "Kierownik Katedry", 15000);
        Employee employee2 = new Employee("Wojciech", "Szczęsny", "71020255311", "Wejherowo", "Woźny", 5500);
        Employee employee3 = new Employee("Adrianna", "Kowalska", "76011535426", "Olsztyn", "Szefowa dziekanatu", 7500);

        Person[] personArray = {student1, student2, student3, employee1, employee2, employee3};

        System.out.println("PersonService.findPersonWithBiggestIncome(personArray) = " + PersonService.findPersonWithBiggestIncome(personArray));

        System.out.println("PersonService.howManyWoman(personArray) = " + PersonService.howManyWoman(personArray));
    }
}
