import java.util.ArrayList;
import java.util.Comparator;

public class sort_reverseANDprintShortcut {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        names.sort(null); // natural order → [Alice, Bob, John]
        System.out.println(names);
        names.sort(Comparator.reverseOrder()); // reverse order
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(11);
        numbers.add(33);

        numbers.sort(null); 
        System.out.println(numbers);
        numbers.sort(Comparator.reverseOrder()); // reverse order
        System.out.println(numbers);

        names.forEach(item -> System.out.print(item + " "));
        System.out.println();
        numbers.forEach(System.out::println);

    }
}
