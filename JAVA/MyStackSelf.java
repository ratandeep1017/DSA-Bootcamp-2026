import java.util.Scanner;

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
            if (arr[i] == value)
                return position;
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
//!--------------------------------------------------------------------------
public class MyStackSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int n = sc.nextInt();
        MyStack stack = new MyStack(n);

        while (true) {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check Overflow / Is Full");
            System.out.println("6. Check Underflow / Is Empty");
            System.out.println("7. Size");
            System.out.println("8. Search element from top");
            System.out.println("9. Clear stack");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) System.out.println("Top element: " + topElement);
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Overflow check / Is stack full -> " + stack.isOverflow());
                    break;
                case 6:
                    System.out.println("Underflow check / Is stack empty -> " + stack.isUnderflow());
                    break;
                case 7:
                    System.out.println("Size of stack -> " + stack.size());
                    break;
                case 8:
                    System.out.print("Enter element to search: ");
                    int pos = stack.search(sc.nextInt());
                    if (pos == -1) System.out.println("Element not found");
                    else  System.out.println("Element found at position from top -> " + pos);
                    break;
                case 9:
                    stack.clear();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}