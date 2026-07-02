import java.util.Collection;
import java.util.LinkedList;

public class LinkedListAllMethods {

    public static void printList(String message, LinkedList<String> list) {
        System.out.println(message + " : " + list);
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        //! add(E e)
        list.add("Java");
        list.add("Python");
        printList("After add(E e)", list);

        //! add(int index, E element)
        list.add(1, "C++");
        printList("After add(index, element)", list);

        //! addFirst(E e)
        list.addFirst("Start");
        printList("After addFirst()", list);

        //! addLast(E e)
        list.addLast("End");
        printList("After addLast()", list);

        //! addAll(Collection<? extends E> c)
        LinkedList<String> otherList = new LinkedList<>();
        otherList.add("HTML"); otherList.add("CSS");
        list.addAll(otherList);
        printList("After addAll()", list);

        //! contains(Object o)
        System.out.println("contains(\"Java\") = " + list.contains("Java"));

        //! element()
        System.out.println("element() = " + list.element());

        //! forEach(Consumer action)
        System.out.println("forEach() output:");
        list.forEach(x -> System.out.println(x));

        //! get(int index)
        System.out.println("get(0) = " + list.get(0));

        //! getFirst()
        System.out.println("getFirst() = " + list.getFirst());

        //! getLast()
        System.out.println("getLast() = " + list.getLast());

        //! indexOf(Object o)
        System.out.println("indexOf(\"Java\") = " + list.indexOf("Java"));

        //! isEmpty()
        System.out.println("isEmpty() = " + list.isEmpty());

        //! lastIndexOf(Object o)
        list.add("Java");
        System.out.println("lastIndexOf(\"Java\") = " + list.lastIndexOf("Java"));

        //! offer(E e)
        list.offer("X");
        printList("After offer()", list);

        //! offerFirst(E e)
        list.offerFirst("Y");
        printList("After offerFirst()", list);

        //! offerLast(E e)
        list.offerLast("Z");
        printList("After offerLast()", list);

        //! peek()
        System.out.println("peek() = " + list.peek());

        //! poll()
        System.out.println("poll() = " + list.poll());
        printList("After poll()", list);

        //! push(E e)
        list.push("STACK_TOP");
        printList("After push()", list);

        //! pop()
        System.out.println("pop() = " + list.pop());
        printList("After pop()", list);

        //! remove()
        System.out.println("remove() = " + list.remove());
        printList("After remove()", list);

        //! remove(Object o)
        list.remove("Java");
        printList("After remove(\"Java\")", list);

        //! removeFirst()
        System.out.println("removeFirst() = " + list.removeFirst());
        printList("After removeFirst()", list);

        //! removeLast()
        System.out.println("removeLast() = " + list.removeLast());
        printList("After removeLast()", list);

        //! removeAll(Collection<?> c)
        LinkedList<String> removeList = new LinkedList<>();
        removeList.add("HTML");
        removeList.add("CSS");
        list.removeAll(removeList);
        printList("After removeAll()", list);

        //! removeIf(Predicate p)
        list.add("A"); list.add("B"); list.add("A");
        printList("Before removeIf()", list);
        list.removeIf(x -> x.equals("A"));
        printList("After removeIf(x -> x.equals(\"A\"))", list);

        //! replaceAll(UnaryOperator op)
        list.replaceAll(x -> x.toUpperCase());
        printList("After replaceAll()", list);

        //! retainAll(Collection<?> c)
        LinkedList<String> retainList = new LinkedList<>();
        retainList.add("B");
        retainList.add("END");
        list.retainAll(retainList);
        printList("After retainAll()", list);

        //! set(int index, E element)
        if (!list.isEmpty()) {
            list.set(0, "NEW");
        }
        printList("After set(0, \"NEW\")", list);

        //! size()
        System.out.println("size() = " + list.size());

        //! sort(Comparator c)
        list.add("APPLE");
        list.add("MANGO");
        list.add("BALL");
        printList("Before sort()", list);
        list.sort(null); //! natural order
        printList("After sort()", list);

        //! subList(int from, int to)
        if (list.size() >= 3) {
            System.out.println("subList(1, 3) = " + list.subList(1, 3));
        }

        //! toArray()
        Object[] arr = list.toArray();
        System.out.print("toArray() = ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        //! clone()
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        printList("Cloned list", clonedList);

        //! clear()
        clonedList.clear();
        printList("After clear() on clonedList", clonedList);
    }
}