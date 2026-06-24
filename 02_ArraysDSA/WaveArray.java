
public class WaveArray {
    // Zig Zag: swap adjacent pair of elements only
    //  1   3   5
    //2   4   6
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
    //  int[] arr = {2,4,7,8,9,10};
        for (int i = 0; i < arr.length-1; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int ele : arr) System.out.print(ele+ " ");
    }
}
