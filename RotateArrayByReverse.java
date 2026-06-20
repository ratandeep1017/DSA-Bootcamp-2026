import java.util.Arrays;

public class RotateArrayByReverse {
    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
    
    //!Left rotate array by k 
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n; // Handle k >= n

        reverse(arr, 0, k - 1); // Step 1: Reverse first k elements
        reverse(arr, k, n - 1); // Step 2: Reverse remaining n-k elements
        reverse(arr, 0, n - 1); // Step 3: Reverse the entire array
    }
    
    //!Right rotate array by k
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n; // Handle k >= n

        reverse(arr, 0, n - 1); // Step 1: Reverse the entire array
        reverse(arr, 0, k - 1); // Step 2: Reverse first k elements
        reverse(arr, k, n - 1); // Step 3: Reverse remaining n-k elements
    }
    
    //! Function to print array
    static void printArray(int[] arr) {
        for (int num : arr) 
            System.out.print(num + " ");
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        // Test Case 1: Left rotation
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        leftRotate(arr1, k1);
        System.out.println("Result: " + Arrays.toString(arr1));
        System.out.println("Expected: [3, 4, 5, 1, 2]");
        System.out.println();
        
        // Test Case 2: Right rotation
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Right rotate by " + k2);
        rightRotate(arr2, k2);
        System.out.println("Result: " + Arrays.toString(arr2));
        System.out.println("Expected: [4, 5, 1, 2, 3]");
        System.out.println();
        
        // Test Case 3: Left rotation with k > n
        int[] arr3 = {10, 20, 30, 40, 50, 60};
        int k3 = 7; // 7 % 6 = 1
        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Left rotate by " + k3 + " (effective: " + (k3 % arr3.length) + ")");
        leftRotate(arr3, k3);
        System.out.println("Result: " + Arrays.toString(arr3));
        System.out.println("Expected: [20, 30, 40, 50, 60, 10]");
        System.out.println();
        
        // Test Case 4: Right rotation with k > n
        int[] arr4 = {10, 20, 30, 40, 50, 60};
        int k4 = 8; // 8 % 6 = 2
        System.out.println("Original array: " + Arrays.toString(arr4));
        System.out.println("Right rotate by " + k4 + " (effective: " + (k4 % arr4.length) + ")");
        rightRotate(arr4, k4);
        System.out.println("Result: " + Arrays.toString(arr4));
        System.out.println("Expected: [50, 60, 10, 20, 30, 40]");
        System.out.println();
        
        // Test Case 5: Using printArray function
        int[] arr5 = {5, 10, 15, 20, 25};
        int k5 = 3;
        System.out.println("Original array: ");
        printArray(arr5);
        System.out.println("Left rotate by " + k5);
        leftRotate(arr5, k5);
        System.out.println("Result: ");
        printArray(arr5);
    }
}