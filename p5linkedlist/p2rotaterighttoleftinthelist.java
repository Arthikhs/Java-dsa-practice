package p5linkedlist;

public class p2rotaterighttoleftinthelist {
    static class Node { int data; Node next; Node(int d) { data = d; } }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); head.next.next = new Node(3); head.next.next.next = new Node(4);

        // Move head to tail (rotate left by 1)
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head;
        head = head.next;
        tail.next.next = null;

        for (Node n = head; n != null; n = n.next) System.out.print(n.data + " ");
    }
}
