public class ReversePartOfArray {

    public static void main(String[] args) {
        // ! using Two Pointer approach
        int[] arr = { 23, 54, 65, 66, 6, 7, 8, 54, 45, 67, 322, 23 };
        // Reverse only these : [66, 6, 7, 8, 54, 45] -> index from : (3 to 8)
        int left = 3 , right = 8;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        for (int x : arr) System.out.print(x + " ");
    }
}