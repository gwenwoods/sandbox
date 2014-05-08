package bootstrap;

import java.util.Random;

/**
 * Also called Bootstrap Aggregating.
 * 
 * Sampling with Replacement.
 */
public class Bagging {

    int[] dataIndices;

    public Bagging(int size) {
        dataIndices = new int[size];
        // System.arraycopy(data, 0, dataIndices, 0, data.length);
    }

    public int[] createBag() {

        Random newRandom = new Random();
        newRandom.setSeed(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());

        int n = dataIndices.length;

        for (int i = 0; i < n; i++) {
            dataIndices[i] = Math.abs(newRandom.nextInt()) % n;
        }

        return dataIndices;
    }
}
