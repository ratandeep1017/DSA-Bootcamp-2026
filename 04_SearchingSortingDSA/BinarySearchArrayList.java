package SearchingSortingDSA;
//! A Built-In Function, for ArrayList named as -> Collections.binarySearch(list, target)
// int foundIndex = Collections.binarySearch(list, target);

import java.util.*;

public class BinarySearchArrayList {
    public static int binarySearchFunc(ArrayList<Integer> arr, int target) {
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
            if (arr.get(mid) < target)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        // List<Integer> arr = Arrays.asList(1, 3, 5, 7, 9, 11, 13);
        // ArrayList<Integer> list = new ArrayList<>(arr);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        int target = 7;
        int foundIndex = binarySearchFunc(list, target);
        if (foundIndex != -1) System.out.println("Binary search: found " + target + " at index " + foundIndex);
        else {
            int idx = findInsertionPosition(list, target);
            list.add(idx, target);
            System.out.println("Binary search: " + target + " not found. So inserted at index " + idx);
        }
        System.out.println(list);
    }
}