public import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushes: " + stack); // [10, 20, 30]

        // peek
        System.out.println("peek(): " + stack.peek()); // 30

        // search (1-based from top)
        System.out.println("search(10): " + stack.search(10)); // 3
        System.out.println("search(99): " + stack.search(99)); // -1

        // contains
        System.out.println("contains(20): " + stack.contains(20)); // true

        // size
        System.out.println("size(): " + stack.size()); // 3

        // elementAt
        System.out.println("elementAt(1): " + stack.elementAt(1)); // 20

        // firstElement / lastElement
        System.out.println("firstElement(): " + stack.firstElement()); // 10
        System.out.println("lastElement(): " + stack.lastElement());   // 30

        // isEmpty / empty
        System.out.println("isEmpty(): " + stack.isEmpty()); // false
        System.out.println("empty(): " + stack.empty());     // false

        // pop
        System.out.println("pop(): " + stack.pop()); // 30
        System.out.println("After pop: " + stack);   // [10, 20]

        // clear
        stack.clear();
        System.out.println("After clear(): " + stack);       // []
        System.out.println("empty() after clear: " + stack.empty()); // true
    }
} {
    
}
