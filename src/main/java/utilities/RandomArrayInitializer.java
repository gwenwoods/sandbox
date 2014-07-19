package utilities;

import java.util.Random;

public class RandomArrayInitializer {

    public static int[] createRandomArray(int n) {
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
        }

        return array;
    }

}
