package datastructure.search;

public class BinarySearch {

    public static int search(int[] array, int target) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        int midIndex = (startIndex + endIndex) / 2;

        while (startIndex < endIndex) {

            // System.out.println(startIndex + " " + endIndex);
            if (target == array[midIndex]) {
                return midIndex;
            } else if (target < array[midIndex]) {
                endIndex = midIndex - 1;
                midIndex = (startIndex + endIndex) / 2;
            } else if (target > array[midIndex]) {
                startIndex = midIndex + 1;
                midIndex = (startIndex + endIndex) / 2;
            }
        }

        return -1;
    }

    public static int searchRotationArray(int[] array, int target, int rotIndex) {

        int size = array.length;
        int startIndex = rotIndex;
        int endIndex = rotIndex + array.length - 1;
        int midIndex = (startIndex + endIndex) / 2;

        while (startIndex < endIndex) {

            int rotMidIndex = midIndex % size;
            System.out.println(startIndex + " " + endIndex);
            if (target == array[rotMidIndex]) {
                return rotMidIndex;

            } else if (target < array[rotMidIndex]) {
                endIndex = midIndex - 1;
                midIndex = (startIndex + endIndex) / 2;

            } else if (target > array[rotIndex]) {
                startIndex = midIndex + 1;
                midIndex = (startIndex + endIndex) / 2;

            }
        }

        return -1;
    }
}
