import java.util.*;

public class SortUniqueStringList {

    public static void sortList(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }

    public static void removeDuplicates(ArrayList<String> list) {
        ArrayList<String> unique = new ArrayList<>();
        for (String x : list)
            if (!unique.contains(x)) unique.add(x);
        list.clear();
        list.addAll(unique);
        System.out.println("Without duplicates: " + list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        //! Split string into array
        String[] part = str.trim().split("\\s+");
        //! Convert array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(part));

        System.out.println("Orignal List: " + list);
        removeDuplicates(list);
        sortList(list);
    }
}