import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 4, 3, 2, 5, 2, 1, 5, 6 };
        // !Using `HashSet` (easiest, order not guaranteed)
        // Set<Integer> set1 = new HashSet<>();
        // !Using `LinkedHashSet` (best: keeps order)
        // Set<Integer> set2 = new LinkedHashSet<>();
        //! -----------------------------------------------
        // for (int x : arr) set1.add(x); System.out.println(set1);
        // for (int x : arr) set2.add(x); System.out.println(set2);

        Arrays.sort(arr); // 1 2 2 3 4 4 5 5 5 6
        // !manually
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j; i++) System.out.print(arr[i] + " ");
    }
}