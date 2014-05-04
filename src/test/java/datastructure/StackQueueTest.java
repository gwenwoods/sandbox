package datastructure;

import java.util.Stack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StackQueueTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public StackQueueTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(StackQueueTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        Stack<String> myStack = new Stack<String>();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }

        System.out.println();

        // Queue<String> myQueue = new Queue<String>() {
        // };
        // myQueue.push("B");
        // myQueue.push("C");
        // myQueue.push("D");
        // myQueue.push("E");
    }
}
