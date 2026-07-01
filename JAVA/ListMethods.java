import java.util.*;
import java.util.Collections;


public class ListMethods {
    public static void main(String[] args) {

        //! Creating List
        //Focus on what you need (a list), not how it’s implemented - OOP
        List<String> list = new ArrayList<>();

        //! add(E e)
        list.add("Java");
        list.add("C++");
        list.add("Python");
        System.out.println("After add: " + list);
        
        //Sort List
        Collections.sort(list);

        //! add(int index, E element)
        list.add(1, "SQL");
        System.out.println("After add at index: " + list);

        //! addAll(Collection c)
        List<String> otherList = new ArrayList<>();
        otherList.add("HTML");
        otherList.add("CSS");
        list.addAll(otherList);
        System.out.println("After addAll: " + list);

        //! addAll(int index, Collection c)
        list.addAll(2, otherList);
        System.out.println("After addAll at index: " + list);

        //! get(int index)
        System.out.println("Element at index 0: " + list.get(0));

        //! set(int index, E element)
        list.set(1, "JavaScript");
        System.out.println("After set: " + list);

        //! remove(int index)
        list.remove(2);
        System.out.println("After remove index: " + list);

        //! remove(Object o)
        list.remove("HTML");
        System.out.println("After remove object: " + list);

        //! removeAll(Collection c)
        list.removeAll(otherList);
        System.out.println("After removeAll: " + list);

        //! contains(Object o)
        System.out.println("Contains Java? " + list.contains("Java"));
        
        //! containsAll(Collection c)
        System.out.println("Contains all otherList? " + list.containsAll(otherList));

        //! indexOf(Object o)
        System.out.println("Index of Java: " + list.indexOf("Java"));
	
        //! lastIndexOf(Object o)
        list.add("Java");
        System.out.println("Last index of Java: " + list.lastIndexOf("Java"));

        //! size()
        System.out.println("Size: " + list.size());

        //! isEmpty()
        System.out.println("Is empty? " + list.isEmpty());

        //! toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        //! array → list
        int[] num = {1, 2, 3};
        List<Integer> numlist = new ArrayList<>();
        for (int e : num) numlist.add(e);
    
        //! list → array
        int[] newArr = new int[numlist.size()];
        for (int i = 0; i < numlist.size(); i++) newArr[i] = numlist.get(i);

        //! subList(int from, int to)
        List<String> sub = list.subList(0, 2);
        System.out.println("SubList: " + sub);

        //! equals(Object o)
        List<String> list2 = new ArrayList<>(list);
        System.out.println("List equals list2? " + list.equals(list2));

        //! forEach(Consumer action)
        System.out.print("Using forEach: ");
        list.forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        for (String item : list) System.out.println(item);
        
        //! clear()
        list.clear();
        System.out.println("After clear: " + list);

        //! isEmpty() again
        System.out.println("Is empty now? " + list.isEmpty());

        //! with list we can change implementations at any time
        //List<Integer> list = new ArrayList<>();
        //list = new LinkedList<>();
    }
} 