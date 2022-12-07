package pl.kurs.zadanie1.models;

public class NegativeParameterException extends Exception{
    public NegativeParameterException() {
        super("Wprowadzono ujemny parametr figury!");
    }
}
