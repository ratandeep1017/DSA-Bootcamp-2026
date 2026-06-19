class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front;
    private Node rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { front = rear = newNode; return; }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) throw new RuntimeException("Queue is empty");
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int peekFront() {
        if (front == null) throw new RuntimeException("Queue is empty");
        return front.data;
    }

    public int peekRear() {
        if (rear == null) throw new RuntimeException("Queue is empty");
        return rear.data;
    }
    public int getSum() {
        int sum = 0;
        Node current = front;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }    
}

public class QueueOperationsSum {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        System.out.println("Sum = " + q.getSum()); // 60
    }
}





