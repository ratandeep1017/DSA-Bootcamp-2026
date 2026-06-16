import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target)  left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static int findInsertionPosition(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (right + left) / 2;
            if (arr[mid] < target) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] sortedData = { 1, 3, 5, 7, 9, 11, 13 };

        // LOGIC OF THIS CODE IS : if the target is found then return the index, 
        // else if the target is not found then return the index to be inserted

        int target = 8;
        
        int foundIndex = binarySearch(sortedData, target);
        
        if (foundIndex != -1) System.out.println("Binary search: found " + target + " at index " + foundIndex);
        else System.out.println("Binary search: " + target + " not found. Insert at index " + findInsertionPosition(sortedData, target));
        
    }
}
