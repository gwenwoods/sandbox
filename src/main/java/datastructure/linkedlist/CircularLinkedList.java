package datastructure.linkedlist;

public class CircularLinkedList {

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
            head = new Node(head, value);
            tail = head;

        } else {
            Node newNode = new Node(head, value);
            tail.next = newNode;
            tail = newNode;
        }
    }

    // public void print() {
    // Node currentNode;
    // currentNode = head;
    // while (currentNode != null) {
    // System.out.println(currentNode.data);
    // currentNode = currentNode.next;
    // }
    // }
}
