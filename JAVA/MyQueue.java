public class MyQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int count;

    MyQueue(int size) {
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    boolean isOverflow() {
        return count == capacity;
    }

    boolean isUnderflow() {
        return count == 0;
    }

    void enqueue(int value) {
        if (isOverflow()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        count++;
        System.out.println(value + " inserted into queue");
    }

    int dequeue() {
        if (isUnderflow()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = arr[front];
        front = (front + 1) % capacity;
        count--;
        return value;
    }

    int peek() {
        if (isUnderflow()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return count == 0;
    }

    boolean isFull() {
        return count == capacity;
    }

    int size() {
        return count;
    }

    boolean contains(int value) {
        if (isUnderflow()) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            if (arr[index] == value) {
                return true;
            }
        }
        return false;
    }

    void display() {
        if (isUnderflow()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    void clear() {
        front = 0;
        rear = -1;
        count = 0;
        System.out.println("Queue cleared");
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("Front element: " + queue.peek());
        System.out.println("Deleted element: " + queue.dequeue());
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Is queue full? " + queue.isFull());
        System.out.println("Overflow check: " + queue.isOverflow());
        System.out.println("Underflow check: " + queue.isUnderflow());
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Contains 20? " + queue.contains(20));

        queue.clear();
        queue.display();
        System.out.println("Underflow check after clear: " + queue.isUnderflow());
    }
}