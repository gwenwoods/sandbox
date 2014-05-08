package bootstrap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BaggingTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public BaggingTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(BaggingTest.class);
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws InterruptedException
     */
    public void testApp() throws InterruptedException {

        Bagging myBagging = new Bagging(5);
        int[] bag1 = new int[5];
        System.arraycopy(myBagging.createBag(), 0, bag1, 0, 5);

        int[] bag2 = new int[5];
        System.arraycopy(myBagging.createBag(), 0, bag2, 0, 5);

        for (int i = 0; i < bag1.length; i++) {
            System.out.println(bag1[i] + " " + bag2[i]);
        }
    }
}
