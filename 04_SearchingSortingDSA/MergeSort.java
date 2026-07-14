import java.util.Arrays;

public class MergeSort {
    // Main merge sort function
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1 ) return; // Base case: single element in the array or empty
        int mid = arr.length / 2; 
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left); // Recursively sort left halves until single element left
        mergeSort(right); // Recursively sort right halves until single element left
        merge(arr, left, right); // helper function to Merge two sorted arrays
    }
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int n1 = left.length;
        int n2 = right.length;
        while (i < n1 && j < n2) 
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];

        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Before Merge Sort: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("After Merge Sort: " + Arrays.toString(arr));
    }
}
