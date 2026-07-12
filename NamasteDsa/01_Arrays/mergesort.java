import java.util.*;
    public class mergesort {

    // Main merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return; // Base case: single element in the array or empty
        int mid = (right + left) / 2;
        mergeSort(arr, left, mid); // Recursively sort left halves until single element left
        mergeSort(arr, mid + 1, right); // Recursively sort right halves until single element left
        merge(arr, left, mid, right); // helper function to Merge two sorted arrays
    }

    // Merge function to combine two sorted subarrays
    private static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)  leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; i++) rightArr[i] = arr[mid  + i + 1];

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) 
            arr[k++] = (leftArr[i] <= rightArr[j]) ? leftArr[i++] : rightArr[j++];
            // if (leftArr[i] <= rightArr[j]) arr[k++] = leftArr[i++];
            // else arr[k++] = rightArr[j++];

        // Copy remaining elements of leftArr (if any)
        while (i < n1) arr[k++] = leftArr[i++];
        // Copy remaining elements of rightArr (if any)
        while (j < n2) arr[k++] = rightArr[j++];
    }

        public static void main(String[] args) throws Exception {
            int[] nums = { 1, 4, 3, 5, 6, 7, 2, 5, 7, 7, 0, 9, 94, -2, 49, 0, -245, -45, -43 };
            mergeSort(nums, 0, nums.length - 1);
            System.out.println(Arrays.toString(nums));
        }
    }

