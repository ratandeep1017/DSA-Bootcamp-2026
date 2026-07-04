class MyStack {
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

    int size() {
        return top + 1;
    }
    void push(int value) {
        if (isOverflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    int pop() {
        if (isUnderflow()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    int search(int value) {
        int position = 1;
        for (int i = top; i >= 0; i--) {
            if (arr[i] == value) return position;
            position++;
        }
        return -1;
    }

    void display() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = top; i >= 0; i--) 
            System.out.println("[" + arr[i] + "] ");
    }

    void clear() {
        top = -1;
        System.out.println("Stack cleared");
    }
}

public class MyStackSelf {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();

        System.out.println("Overflow check / Is stack full -> " + stack.isOverflow());
        System.out.println("Underflow check / Is stack empty -> " + stack.isUnderflow());
        System.out.println("Size of stack -> " + stack.size());
        System.out.println("Search 10 from top -> " + stack.search(10));

        stack.clear();
        stack.display();
        System.out.println("Underflow check after clear: " + stack.isUnderflow());
    }
}