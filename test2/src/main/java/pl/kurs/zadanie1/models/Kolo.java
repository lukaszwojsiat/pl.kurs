package pl.kurs.zadanie1.models;

public class Kolo extends Figura {
    private double r;
    private int counter;

    public Kolo() {
    }

    public Kolo(double r) throws NegativeParameterException {
        if (r < 0) {
            throw new NegativeParameterException();
        }
        this.r = r;
        counter = getCounter();
    }

    @Override
    public double getPole() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getObwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "Figura nr " + counter + ": Kolo o promieniu " + Math.round(r);
    }
}
