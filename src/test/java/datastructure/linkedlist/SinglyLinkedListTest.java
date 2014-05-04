package datastructure.linkedlist;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SinglyLinkedListTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public SinglyLinkedListTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(SinglyLinkedListTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");
        myList.add("G");

        myList.print();

        // ---------------
        // Find middle element
        SinglyLinkedList.Node p1 = myList.head;
        SinglyLinkedList.Node p2 = myList.head;

        System.out.println(p1.getData() + " " + p2.getData());

        while (p1 != null) {
            p1 = p1.next();

            if (p1 == null) {
                break;
            }
            p1 = p1.next();
            p2 = p2.next();

            // System.out.println(p1.getData() + " " + p2.getData());
        }

        System.out.println();
        System.out.println(" middle element " + p2.getData());

        // ---------------
        // Find 3rd from last

        p1 = myList.head;
        p2 = myList.head;

        p1 = p1.next();
        p1 = p1.next();

        while (p1 != null) {
            // System.out.println(p1.getData() + " " + p2.getData());
            p1 = p1.next();
            if (p1 == null) {
                break;
            }
            p2 = p2.next();

        }
        System.out.println();
        System.out.println(" third from end " + p2.getData());

        // --------
        // reverse
        myList.reverse();

        myList.print();

    }
}
