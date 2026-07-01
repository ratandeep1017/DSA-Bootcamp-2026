import java.util.HashSet;
import java.util.Spliterator;

public class HashSetAllMethods {
    public static void main(String[] args) {

        // newHashSet(int numElements)
        // !HashSet<Integer> set = HashSet.newHashSet(10);
        HashSet<Integer> set = new HashSet<>();

        // !add(E e)
        System.out.println("add(10): " + set.add(10));
        System.out.println("add(20): " + set.add(20));
        System.out.println("add(30): " + set.add(30));
        System.out.println("add(10) again: " + set.add(10)); // duplicate
        System.out.println("Set after add: " + set);
        System.out.println("------------------------------------------------");

        // !addAll(Collection<? extends E> c)
        HashSet<Integer> otherSet = new HashSet<>();
        otherSet.add(40);
        otherSet.add(50);
        otherSet.add(60);
        set.addAll(otherSet);
        System.out.println("After addAll(otherSet): " + set);
        System.out.println("------------------------------------------------");

        // !remove(Object o)
        System.out.println("remove(20): " + set.remove(20));
        System.out.println("Set after remove: " + set);
        System.out.println("------------------------------------------------");

        //!contains(Object o)
        System.out.println("contains(30): " + set.contains(30));
        System.out.println("contains(100): " + set.contains(100));
        System.out.println("------------------------------------------------");

        //!containsAll(Collection<?> c)
        HashSet<Integer> checkSet = new HashSet<>();
        checkSet.add(10);
        checkSet.add(30);
        // Retrun true or false if set contains another set
        System.out.println("containsAll(checkSet): " + set.containsAll(checkSet)); 
        System.out.println("------------------------------------------------");

        //!size()
        System.out.println("size(): " + set.size());
        System.out.println("------------------------------------------------");

        //!isEmpty()
        System.out.println("isEmpty(): " + set.isEmpty());
        System.out.println("------------------------------------------------");

        //!Set to Array (Integer to int)
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer ele : set) 
            arr[i++] = ele; // auto-unboxing
        System.out.println("\n------------------------------------------------");

        //!forEach(Consumer action)
        System.out.print("forEach(): ");
        set.forEach(x -> System.out.print(x + " "));
        System.out.println("\n------------------------------------------------");

        //!toArray()
        Object[] objArr = set.toArray();
        System.out.print("toArray(): ");
        for (Object x : objArr) System.out.print(x + " ");
        System.out.println("\n------------------------------------------------");

        //! toArray(T[] a)
        Integer[] intArr = set.toArray(new Integer[0]);
        System.out.print("toArray(new Integer[0]): ");
        for (Integer x : intArr) 
            System.out.print(x + " ");
        System.out.println("\n------------------------------------------------");

        //!removeIf(Predicate<? super E> filter)
        set.removeIf(x -> x > 40);
        System.out.println("After removeIf(x > 40): " + set);
        System.out.println("------------------------------------------------");

        //!retainAll(Collection<?> c)
        HashSet<Integer> retainSet = new HashSet<>();
        retainSet.add(10);
        retainSet.add(30);
        retainSet.add(99);
        set.retainAll(retainSet);
        System.out.println("After retainAll(retainSet): " + set);
        System.out.println("------------------------------------------------");

        //!removeAll(Collection<?> c)
        HashSet<Integer> removeSet = new HashSet<>();
        removeSet.add(10);
        set.removeAll(removeSet);
        System.out.println("After removeAll(removeSet): " + set);
        System.out.println("------------------------------------------------");

        //!toString()
        System.out.println("toString(): " + set.toString());
        System.out.println("------------------------------------------------");

        //!clear()
        // set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("------------------------------------------------");

        //!isEmpty() after clear
        // System.out.println("isEmpty() after clear: " + set.isEmpty());

        //!clone()
        HashSet<Integer> clonedSet = (HashSet<Integer>) set.clone();
        System.out.println("clone(): " + clonedSet);
        System.out.println("------------------------------------------------");

        //!equals(Object o)
        System.out.println("equals(clonedSet): " + set.equals(clonedSet));
        System.out.println("------------------------------------------------");

        //!hashCode()
        System.out.println("hashCode(): " + set.hashCode());
        System.out.println("------------------------------------------------");

        //!spliterator()
        System.out.print("spliterator(): ");
        Spliterator<Integer> sp = set.spliterator();
        sp.forEachRemaining(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("------------------------------------------------");

        //!stream()
        System.out.print("stream(): ");
        set.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("------------------------------------------------");

        //!parallelStream()
        System.out.print("parallelStream(): ");
        set.parallelStream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("------------------------------------------------");
    }
}