public class LeftRightRotateArrayByReverse {
    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;r--;
        }
    }
    
    //!Left rotate array by k 
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k %= n; // Handle k >= n

        reverse(arr, 0, k - 1); // Step 1: Reverse first k elements
        reverse(arr, k, n - 1); // Step 2: Reverse remaining n-k elements
        reverse(arr, 0, n - 1); // Step 3: Reverse the entire array
    }
    
    //!Right rotate array by k
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k %= n; // Handle k >= n

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
        //-> Test Case 1: Left rotation
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 2;
        leftRotate(arr1, k1);
        printArray(arr1); //Expected: [3, 4, 5, 1, 2]
        
        //-> Test Case 2: Right rotation
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        rightRotate(arr2, k2);
        printArray(arr2); //Expected: [4, 5, 1, 2, 3]

        //-> Test Case 3: Left rotation with k > n
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int k3 = 7; // 7 % 6 = 1
        leftRotate(arr3, k3); //Expected: [2, 3, 4, 5, 6, 1]
        printArray(arr3); 
        
        //-> Test Case 4: Right rotation with k > n
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int k4 = 8; // 8 % 6 = 2
        rightRotate(arr4, k4);
        printArray(arr4); //Expected: [5, 6, 1, 2, 3, 4]
    }
}