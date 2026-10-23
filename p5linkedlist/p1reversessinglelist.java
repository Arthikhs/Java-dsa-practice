package p5linkedlist;

public class p1reversessinglelist {
    static class Node { int data; Node next; Node(int d) { data = d; } }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2); head.next.next = new Node(3); head.next.next.next = new Node(4);

        Node prev = null, curr = head;
        while (curr != null) { Node next = curr.next; curr.next = prev; prev = curr; curr = next; }
        head = prev;

        for (Node n = head; n != null; n = n.next) System.out.print(n.data + " ");
    }
}
