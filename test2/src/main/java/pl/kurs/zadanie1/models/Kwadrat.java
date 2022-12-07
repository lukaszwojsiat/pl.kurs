package pl.kurs.zadanie1.models;

public class Kwadrat extends Figura {
    private double a;
    private int counter;

    public Kwadrat() {
    }

    public Kwadrat(double a) throws NegativeParameterException{
        super();
        if (a < 0)
            throw new NegativeParameterException();
        this.a = a;
        counter = getCounter();
    }

    @Override
    public double getPole() {
        return a * a;
    }

    @Override
    public double getObwod() {
        return 4 * a;
    }

    @Override
    public String toString() {
        return "Figura nr " + counter + ": Kwadrat o boku " + Math.round(a);
    }
}
