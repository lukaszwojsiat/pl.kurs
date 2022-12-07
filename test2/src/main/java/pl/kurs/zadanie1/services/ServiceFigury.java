package pl.kurs.zadanie1.services;

import pl.kurs.zadanie1.models.Figura;

public class ServiceFigury {


    public Figura znajdzFigureZNajwiekszymPolem(Figura[] f) {
        double maxPole = 0;
        Figura figuraZMaxPolem = null;

        for (int i = 0; i < f.length; i++) {
            if (f[i].getPole() >= maxPole) {
                maxPole = f[i].getPole();
                figuraZMaxPolem = f[i];
            }
        }
        return figuraZMaxPolem;
    }


    public Figura znajdzFigureZNajwiekszymObwodem(Figura[] f) {
        double maxObwod = 0;
        Figura figuraZMaxObwodem = null;

        for (int i = 0; i < f.length; i++) {
            if (f[i].getObwod() >= maxObwod) {
                maxObwod = f[i].getObwod();
                figuraZMaxObwodem = f[i];
            }
        }
        return figuraZMaxObwodem;
    }
}
