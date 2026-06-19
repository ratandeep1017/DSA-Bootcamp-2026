import java.util.*;

public class find_delete_min_max {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int max = arr[0], min = arr[0];

        for (int i = 1; i < n; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        System.out.println("Max : " + max + " and Min : " + min);

        for (int i = 0; i < n; i++) {
            if (max == arr[i])  continue;
            if (min == arr[i])  continue;
            System.out.print(arr[i] + " ");
        }
    }
}
