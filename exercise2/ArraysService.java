package pl.kurs.exercise2;

public class ArraysService {

    public static double getNumber(double[] array, String option) {
        if (array == null)
            return Double.NaN;
        return switch (option) {
            case "MAX" -> findMax(array);
            case "MIN" -> findMin(array);
            case "SUM" -> addAllNumbers(array);
            default -> Double.NaN;
        };
    }

    private static double findMax(double[] array) {
        double maxNumber = array[0];

        if (array == null)
            return Double.NaN;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber)
                maxNumber = array[i];
        }
        return maxNumber;
    }

    private static double findMin(double[] array) {
        double minNumber = array[0];

        if (array == null)
            return Double.NaN;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumber)
                minNumber = array[i];
        }
        return minNumber;
    }

    private static double addAllNumbers(double[] array) {
        double result = 0;

        if (array == null)
            return Double.NaN;
        for (double d : array) {
            result += d;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] array1 = {1, 3, 4, 2, 5, 0, -3};
        double[] array2 = {0, -20, 8, -14};
        double[] array3 = {23, 12, 0, -4};
        double[] array4 = null;

        double max = ArraysService.getNumber(array1, "MAX");
        double min = ArraysService.getNumber(array2, "MIN");
        double sum = ArraysService.getNumber(array3, "SUM");
        double summm = ArraysService.getNumber(array1, "SUMMMM");
        double max1 = ArraysService.getNumber(array4, "MAX");
    }
}
