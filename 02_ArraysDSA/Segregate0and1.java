
public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0 };
        // 0 0 0 - - - - 1 1 1
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] == 0) l++;
            else if (arr[r] == 1) r--;
            else if (arr[l] == 1 && arr[r] == 0) { //SWAP
                arr[l] = 0;
                arr[r] = 1;
                l++; r--;
            }
        }
        for (int ele : arr) System.out.print(ele + " ");
    }
}
