package pl.kurs.zadanie1.app;

import pl.kurs.zadanie1.models.Figura;
import pl.kurs.zadanie1.models.NegativeParameterException;
import pl.kurs.zadanie1.services.ServiceFigury;

public class Figury {
    public static void main(String[] args) throws NegativeParameterException {
        Figura[] figury = {Figura.stworzKwadrat(10), Figura.stworzKolo(10), Figura.stworzProstokat(10, 20), Figura.stworzKwadrat(15)};
        ServiceFigury serviceFigury = new ServiceFigury();

        for (Figura f : figury) {
            System.out.println(f);
        }

        System.out.println("serviceFigury.znajdzFigureZNajwiekszymObwodem(figury) = " + serviceFigury.znajdzFigureZNajwiekszymObwodem(figury));
        System.out.println("serviceFigury.znajdzFigureZNajwiekszymPolem(figury) = " + serviceFigury.znajdzFigureZNajwiekszymPolem(figury));

        for (Figura f : figury) {
            if (f.equals(Figura.stworzProstokat(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }
    }
}
