public class BasicLinkedList3Nodes {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create 3 nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Link them: first -> second -> third -> null
        first.next = second;
        second.next = third;

        // 'first' is the head of the list
        Node head = first;

        // Optional: print to verify structure
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}