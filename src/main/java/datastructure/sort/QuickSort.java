package datastructure.sort;

/**
 * TODO: Not done yet. We need to track pivot, not just the pivot index.
 */
public class QuickSort {

    public static int[] sort(int[] array) {

        int size = array.length;
        int pivotIndex = (int) Math.round(Math.random()) % size;

        int frontIndex = 0;
        int backIndex = size - 1;

        while (frontIndex < backIndex) {
            for (int i = frontIndex; i <= pivotIndex; i++) {
                if (array[i] >= array[pivotIndex]) {
                    frontIndex = i;
                    break;
                }
            }

            for (int i = backIndex; i >= pivotIndex; i--) {
                if (array[i] <= array[pivotIndex]) {
                    backIndex = i;
                    break;
                }
            }

            int temp = array[frontIndex];
            array[frontIndex] = array[backIndex];
            array[backIndex] = temp;
        }
        return null;
        // return merge(first, second);

    }

    public static int[] merge(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int n3 = n1 + n2;
        int[] array = new int[n3];

        int a1Index = 0;
        int a2Index = 0;
        int a3Index = 0;

        while (a3Index < n3) {

            if (a1Index == n1) {
                array[a3Index] = a2[a2Index];
                a2Index++;

            } else if (a2Index == n2) {
                array[a3Index] = a1[a1Index];
                a1Index++;

            } else if (a1[a1Index] < a2[a2Index]) {
                array[a3Index] = a1[a1Index];
                a1Index++;

            } else {
                array[a3Index] = a2[a2Index];
                a2Index++;
            }
            a3Index++;
        }

        return array;
    }
}
