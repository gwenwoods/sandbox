package datastructure.linkedlist;

public class SinglyLinkedList {

    public Node head;
    public Node tail;

    public static class Node {

        private Node(Node next, String data) {
            this.next = next;
            this.data = data;
        }

        Node next;
        String data;

        public Node next() {
            return next;
        }

        public String getData() {
            return data;
        }
    }

    public void add(String value) {
        if (head == null) {
            head = new Node(null, value);
            tail = head;
        } else {
            Node newNode = new Node(null, value);
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void reverse() {

        Node tempNode;
        Node currentNode;
        Node nextNode;

        currentNode = head;
        nextNode = currentNode.next;
        tempNode = null;

        while (nextNode != null) {

            currentNode.next = tempNode;
            tempNode = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next();
        }

        currentNode.next = tempNode;
        head = currentNode;

        // System.out.println("Head " + head.data);
        // System.out.println("Tail " + tail.data);
    }

    public void print() {
        Node currentNode;
        currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
