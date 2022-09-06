package pl.kurs.exercise4;

public class Hourglass {

    public static void drawHourglass(int n) {
        if (n % 2 == 0 || n < 3)
            System.out.println("Nie można narysować takiej klepsydry!");
        else
            for (int i = 0; i < n + 1; i++) {
                if ((n - (i * 2)) == -1)
                    continue;
                if ((n - (i * 2)) > 0)
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                else
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" ");
                    }
                for (int j = 0; j < Math.abs((n - (i * 2))); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        drawHourglass(21);
    }
}
