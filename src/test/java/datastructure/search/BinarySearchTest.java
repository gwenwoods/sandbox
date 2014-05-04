package datastructure.search;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BinarySearchTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public BinarySearchTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(BinarySearchTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        int[] array = new int[9];

        array[0] = 2;
        array[1] = 6;
        array[2] = 13;
        array[3] = 21;
        array[4] = 36;
        array[5] = 47;
        array[6] = 63;
        array[7] = 81;
        array[8] = 97;

        int targetIndex = BinarySearch.search(array, 81);

        System.out.println(targetIndex);

        targetIndex = BinarySearch.search(array, 100);
        System.out.println(targetIndex);

        // -----------------------------
        int[] rotArray = new int[9];

        rotArray[0] = 63;
        rotArray[1] = 81;
        rotArray[2] = 97;
        rotArray[3] = 2;
        rotArray[4] = 6;
        rotArray[5] = 13;
        rotArray[6] = 21;
        rotArray[7] = 36;
        rotArray[8] = 47;

        targetIndex = BinarySearch.searchRotationArray(rotArray, 81, 3);
        System.out.println(targetIndex);

    }
}
