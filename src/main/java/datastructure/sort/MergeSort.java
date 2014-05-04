package datastructure.sort;


public class MergeSort {

    public static int[] sort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        int midIndex = array.length / 2;
        int firstN = midIndex;
        int secondN = array.length - firstN;

        int[] first = new int[firstN];
        int[] second = new int[secondN];

        System.arraycopy(array, 0, first, 0, firstN);
        System.arraycopy(array, midIndex, second, 0, secondN);

        first = sort(first);
        second = sort(second);

        return merge(first, second);

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
