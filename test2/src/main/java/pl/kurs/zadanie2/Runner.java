package pl.kurs.zadanie2;

public class Runner {
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        StringBuffer sb1 = new StringBuffer("0");
        for (int i = 1; i < 1000; i++) {
            sb1.append(" ");
            sb1.append(i);
        }
        String s1 = sb1.toString();
        long stop1 = System.nanoTime();

        long start2 = System.nanoTime();
        String s2 = "0";
        for (int i = 1; i < 1000; i++) {
            s2 += " " + i;
        }
        long stop2 = System.nanoTime();

        long result1 = stop1 - start1;
        long result2 = stop2 - start2;

        double ratio = ((double) result2)/result1;
        System.out.println(ratio);

        //String w javie jest niemodyfikwalny i podczas konkatenacji za każdym razem tworzony jest nowy obiekt String
        //StringBuffer wykorzystuje wolną przestrzeń do dodania kolejnego Stringa (jeśli taką posiada).
    }
}
