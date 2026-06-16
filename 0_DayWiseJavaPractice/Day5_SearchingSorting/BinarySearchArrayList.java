import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearchArrayList {
    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr.get(mid) == target) return mid;
            if (arr.get(mid) < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int findInsertionPosition(ArrayList<Integer> arr, int target) {
        int left = 0;
        int right = arr.size();
        while (left < right) {
            int mid = (right + left) / 2;
            if (arr.get(mid) < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        int target = 7;
        int foundIndex = binarySearch(list, target);
        if (foundIndex != -1) System.out.println("Binary search: found " + target + " at index " + foundIndex);
        else {
            int idx = findInsertionPosition(list, target);
            System.out.println("Binary search: " + target + " not found. Insert at index " + idx);
            list.add(idx , target);
        }
        System.out.println(list);
}
}