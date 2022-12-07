package pl.kurs.zadanie1.models;

public class Prostokat extends Figura {
    private double a;
    private double b;
    private int counter;

    public Prostokat() {
    }

    public Prostokat(double a, double b) throws NegativeParameterException {
        super();
        if (a < 0 || b < 0)
            throw new NegativeParameterException();
        this.a = a;
        this.b = b;
        counter = getCounter();
    }

    @Override
    public double getPole() {
        return a * b;
    }

    @Override
    public double getObwod() {
        return (a + b) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(this);
    }

    @Override
    public String toString() {
        return "Figura nr " + counter + ": Prostokat o bokach " + Math.round(a) + "x" + Math.round(b);
    }
}
