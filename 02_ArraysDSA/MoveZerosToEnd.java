public class MoveZerosToEnd {
    public static void main(String[] args) {
        //! Move all non-zero elements forward.Then fill remaining positions with zero.
        int[] arr = { 0, 1, 0, 3, 12, 0, 23, 0, 3, 3, 0, 5 };
        //1 3 12 23 3 3 5 _ _ _ _ _
        int count = 0;
        for (int x : arr) {
            if (x != 0) {
                arr[count] = x;
                count++;
            }
        }

        // System.out.println("Total Non Zero Element = " + count);
        // System.out.println("Total Zeros = " + (arr.length - count));

        for (int i = count; i < arr.length; i++) arr[i] = 0;
        //1 3 12 23 3 3 5 0 0 0 0 0
        for (int x : arr) System.out.print(x + " ");

    }
}
