package pl.kurs.exercise1;

import java.util.Scanner;

public class NNumbers {

    public static int[] insertNNumbers(int n) {
        if (n <= 0)
            return null;

        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Wprowadź " + (i + 1) + " liczbę: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = insertNNumbers(3);
        array1 = insertNNumbers(4);
        array1 = insertNNumbers(-6);
    }
}
