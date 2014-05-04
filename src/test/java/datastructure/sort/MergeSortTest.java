package datastructure.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MergeSortTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public MergeSortTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(MergeSortTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        int[] a1 = new int[3];
        a1[0] = 17;
        a1[1] = 33;
        a1[2] = 45;

        int[] a2 = new int[5];
        a2[0] = 11;
        a2[1] = 14;
        a2[2] = 25;
        a2[3] = 35;
        a2[4] = 56;

        int[] combine = MergeSort.merge(a1, a2);

        for (int v : combine) {
            System.out.println(v);
        }

        // -------------------
        int[] myArray = new int[10];
        myArray[0] = 8;
        myArray[1] = 7;
        myArray[2] = 5;
        myArray[3] = 1;
        myArray[4] = 6;
        myArray[5] = 9;
        myArray[6] = 0;
        myArray[7] = 2;
        myArray[8] = 4;
        myArray[9] = 3;

        myArray = MergeSort.sort(myArray);
        for (int v : myArray) {
            System.out.println(v);
        }
    }
}
