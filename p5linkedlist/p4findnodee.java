package p5linkedlist;

public class p4findnodee {
    static class Node { int data; Node next; Node(int d) { data = d; } }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); head.next.next = new Node(3); head.next.next.next = new Node(4);

        int pos = 2;
        Node curr = head;
        for (int i = 0; i < pos && curr != null; i++) curr = curr.next;
        System.out.println("Node at position " + pos + ": " + (curr != null ? curr.data : "null"));
    }
}
