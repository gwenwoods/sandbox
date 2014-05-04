package datastructure.search.linkedlist;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import linkedlist.CircularLinkedList;

/**
 * Unit test for simple App.
 */
public class CircularLinkedListTest extends TestCase {
    /**
     * Create the test case
     * 
     * @param testName
     *            name of the test case
     */
    public CircularLinkedListTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(CircularLinkedListTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {

        CircularLinkedList myList = new CircularLinkedList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        // myList.print();

        // ---------------
        CircularLinkedList.Node p1 = myList.head;
        CircularLinkedList.Node p2 = myList.head;

        System.out.println(p1.getData() + " " + p2.getData());

        while (p1 != null) {
            p1 = p1.next();

            if (p1 == null) {
                break;
            }
            p1 = p1.next();
            p2 = p2.next();

            System.out.println();
            if (p1.equals(p2)) {
                System.out.println("It's circular");
                System.out.println(p1.getData() + " " + p2.getData());
                break;
            }

            System.out.println(p1.getData() + " " + p2.getData());
        }

        // System.out.println();
        // System.out.println(p2.getData());

    }
}
