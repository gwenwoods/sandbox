package problems;

import java.util.Random;

public class LargestKElements {

    /**
     * 
     * Find the k largest elements in an n element array.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int n = 20;
        int k = 5;

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        // ----------------------------------
        Random myRandom = new Random();

        for (int t = 0; t < n * 100; t++) {
            int i = myRandom.nextInt(n);
            int j = myRandom.nextInt(n);

            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            // System.out.println(i + " " + j);
        }

        // ------------------------------------
        // compare operation = n * k times
        // swap operation: max = n * k , min = 1
        // time complexity O(nk+1) ~ O(2nk) ==> O(nk)
        // space complexity: no additional space, only tmp, so O(1)
        for (int i = 0; i < k; i++) {
            for (int j = i; j < n; j++) {
                if (array[j] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        // ------------------------
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

}
