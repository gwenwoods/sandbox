package datastructure.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BubbleSortTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public BubbleSortTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(BubbleSortTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        Integer[] myArray = new Integer[10];
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

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    Integer temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
}
