package Test;

public class Sort {

    public static void sort(String[] input) {

    }

    public static String findSmallest(String[] x) {
        int smallestIndex = 0;
        for (int i = 0; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallestIndex]);
            //with the compareTo,if x[i] < x[smallestIndex],cmp will be -1.
            if(cmp < 0) {
                smallestIndex = i;
            }
        }
        return x[smallestIndex];
    }
}
