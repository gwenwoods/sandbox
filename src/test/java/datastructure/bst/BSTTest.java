package datastructure.bst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BSTTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public BSTTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(BSTTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        BST<Integer> myBST = new BST<Integer>();
        myBST.insert(5);
        myBST.insert(10);
        myBST.insert(9);
        myBST.insert(0);

        System.out.println(myBST.findMax());

        myBST.printInOrder();

        System.out.println();
        myBST.printPreOrder();
    }
}
