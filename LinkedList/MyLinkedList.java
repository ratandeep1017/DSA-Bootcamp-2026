/*
! 1. Node class for singly linked list
! 2. Declare int size and pointer to first node in list
! 3. create Constructor: initialize empty list
! 4. addAtHead(int val)
! 5. addAtTail(int val)
! 6. display + count
! 7. main Function
*/

class MyLinkedList {
    // Node class for singly linked list
    private class Node {
        int val; // value stored in node
        Node next; // reference to next node

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head; // pointer to first node in list
    private int size; // number of nodes in the list

    // Constructor: initialize empty list
    public MyLinkedList() {
        head = null; // no nodes initially
        size = 0; // size is 0
    }

    // Add a node of value 'val' at the head
    public void addAtHead(int val) {
        Node newNode = new Node(val); // Create new node
        newNode.next = head; // New node's next should point to current head
        head = newNode; // Update head to new node
        size++; // Increase size
    }

    // Add a node of value 'val' at the tail (end)
    public void addAtTail(int val) {
        // If list is empty, adding at tail is same as adding at head
        if (size == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val); // Create new node
        Node current = head;
        while (current.next != null)
            current = current.next; // Go to last node
        // Last node's next should point to new node
        current.next = newNode;
        size++; // Increase size
    }

    // Get value at given index (0-based) and If index is invalid, return -1
    public void get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of Range");
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        System.out.println("Value at Index " + index + " is: " + current.val);
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
        System.out.println("Total Node Count : " + size);
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtTail(5);
        list.addAtTail(6);
        list.addAtTail(6);
        list.addAtTail(6);
        list.addAtTail(6);
        list.addAtTail(7);
        list.display();

        list.addAtTail(8);
        list.addAtTail(9);
        list.display();

        list.get(4);
        list.get(32);
    }
}
