public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
            left++; right--;
        }
        //!we can use for loop instead of while loop in this way
        // for (int l= left, r= right; left < right; left++, right--) 
        //     int temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;

        for (int x : arr) System.out.print(x + " ");
    }
}
