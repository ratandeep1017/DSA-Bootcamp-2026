public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        //! using Two Pointer approach

        int left = 0;
        int right = arr.length - 1;     
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }

        // ! Using a for loop
        // int n = arr.length ;
        // for (int i=0; i<n/2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }
        
        // !we can use for loop instead of while loop in this way
        // for (int l= left, r= right; left < right; left++, right--)
        // int temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;
        
        for (int x : arr) System.out.print(x + " ");
    }
}
