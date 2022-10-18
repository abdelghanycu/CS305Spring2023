package week01;

import java.util.Arrays;


/**
 *
 * @author Hanood
 */
public class CS305Lab1General {

    public static void main(String[] args) {

        // Sorting small given array
        System.out.println("--- Exchange Sort ---");
        long start1 = System.currentTimeMillis();
        exchangeSort(7, new int[]{5, 6, 10, 3, 9, 2, 20});
        long end1 = System.currentTimeMillis();
        long time1 = end1 - start1;
        System.out.println("Time of sorting first array: " + time1 + " ms");

        // Sorting array with generated 10000 elements        
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 1000);
        }
        long start2 = System.currentTimeMillis();
        exchangeSort(10000, a);
        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;
        System.out.println("Time of sorting second array: " + time2 + " ms");

        System.out.println();
        
        // Test linear search
        System.out.println("--- Linear Search ---");
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random() * 10);
        }
        long start3 = System.currentTimeMillis();
        int indx = linearSearch(10, b, 0);
        long end3 = System.currentTimeMillis();
        long time3 = end3 - start3;
        System.out.println(Arrays.toString(b));
        System.out.println((indx != -1) ? "Element found at index " + indx : "Element not found");
        System.out.println("Time of searching: " + time3 + " ms");
        
        
    }

    public static int linearSearch(int n, int[] a, int x) {
        int location = 0;
        while (location < n && a[location] != x) {
            location++;
        }
        if (location >= n) {
            location = -1;
        }
        return location;
    }

    public static void exchangeSort(int n, int[] a) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}
