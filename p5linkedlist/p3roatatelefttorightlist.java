package p5linkedlist;

public class p3roatatelefttorightlist {
    static class Node { int data; Node next; Node(int d) { data = d; } }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); head.next.next = new Node(3); head.next.next.next = new Node(4);

        // Move tail to head (rotate right by 1)
        Node prev = null, curr = head;
        while (curr.next != null) { prev = curr; curr = curr.next; }
        prev.next = null;
        curr.next = head;
        head = curr;

        for (Node n = head; n != null; n = n.next) System.out.print(n.data + " ");
    }
}
