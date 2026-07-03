import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add / offer
        queue.add(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("After add/offer: " + queue); // [10, 20, 30]

        // element / peek
        System.out.println("element(): " + queue.element()); // 10
        System.out.println("peek(): " + queue.peek());       // 10

        // contains
        System.out.println("contains(20): " + queue.contains(20)); // true

        // size
        System.out.println("size(): " + queue.size()); // 3

        // remove(Object)
        queue.remove(20);
        System.out.println("After remove(20): " + queue); // [10, 30]

        // poll
        System.out.println("poll(): " + queue.poll()); // 10
        System.out.println("After poll: " + queue);    // [30]

        // isEmpty
        System.out.println("isEmpty(): " + queue.isEmpty()); // false

        // iterator
        System.out.print("Iterating: ");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // remove() — throws exception if empty
        System.out.println("remove(): " + queue.remove()); // 30
        System.out.println("After remove(): " + queue);    // []

        // poll on empty queue — returns null, no exception
        System.out.println("poll() on empty: " + queue.poll()); // null

        // add then clear
        queue.add(99);
        System.out.println("Before clear: " + queue); // [99]
        queue.clear();
        System.out.println("After clear(): " + queue); // []
    }
}