public class MergeSort {
    
    // Main merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return; // Base case: single element or empty
        }
        
        int mid = left + (right - left) / 2;
        
        // Recursively sort left and right halves
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        
        // Merge the sorted halves
        merge(arr, left, mid, right);
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
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        
        // Merge the temporary arrays
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements of leftArr (if any)
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        // Copy remaining elements of rightArr (if any)
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Array before sorting:");
        printArray(arr);
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}