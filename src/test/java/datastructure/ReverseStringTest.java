package datastructure;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ReverseStringTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public ReverseStringTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(ReverseStringTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        String myStr = "ABCDE";
        String[] myArray = myStr.split("");

        StringBuilder newStr = new StringBuilder();
        for (int i = myArray.length - 1; i >= 0; i--) {
            newStr.append(myArray[i]);
        }

        System.out.println(newStr);
    }
}
