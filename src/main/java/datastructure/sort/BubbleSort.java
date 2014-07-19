package datastructure.sort;

import utilities.RandomArrayInitializer;

public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int n = 20;

        int[] array = RandomArrayInitializer.createRandomArray(n);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        int loopCount = 0;
        int operationCount = 0;

        for (int i = 0; i < n; i++) {
            loopCount++;
            boolean swapped = false;

            for (int j = 0; j < n - 1; j++) {
                operationCount++;
                if (array[j + 1] < array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println("loop count : " + loopCount);
        System.out.println("operation count : " + operationCount);

        // ------------------------
        // Time complexity:
        // best: O(n), average: O(n^2), worst: O(n^2)
        //
        // Space complexity: O(1)
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
