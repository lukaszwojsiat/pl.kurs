package pl.kurs.zadanie1.models;

import java.io.Serializable;

public abstract class Figura implements Serializable {
    private static int counter = 0;

    public Figura() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public abstract double getPole();

    public abstract double getObwod();

    public static Kwadrat stworzKwadrat(double a) throws NegativeParameterException {
        return new Kwadrat(a);
    }

    public static Kolo stworzKolo(double r) throws NegativeParameterException {
        return new Kolo(r);
    }

    public static Prostokat stworzProstokat(double a, double b) throws NegativeParameterException {
        return new Prostokat(a, b);
    }
}
