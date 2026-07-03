public class MyStack {
    int[] arr;
    int top;
    int capacity;

    MyStack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    boolean isOverflow() {
        return top == capacity - 1;
    }

    boolean isUnderflow() {
        return top == -1;
    }

    void push(int value) {
        if (isOverflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = value;
        System.out.println(value + " pushed into stack");
    }

    int pop() {
        if (isUnderflow()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int value = arr[top];
        top--;
        return value;
    }

    int peek() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    int size() {
        return top + 1;
    }

    int search(int value) {
        int position = 1;
        for (int i = top; i >= 0; i--) {
            if (arr[i] == value) {
                return position;
            }
            position++;
        }
        return -1;
    }

    void display() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void clear() {
        top = -1;
        System.out.println("Stack cleared");
    }
}

public class StackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        System.out.println("Overflow check: " + stack.isOverflow());
        System.out.println("Underflow check: " + stack.isUnderflow());
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Search 10 from top: " + stack.search(10));

        stack.clear();
        stack.display();
        System.out.println("Underflow check after clear: " + stack.isUnderflow());
    }
}