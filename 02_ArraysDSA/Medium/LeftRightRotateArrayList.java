import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeftRightRotateArrayList {
    // !Left rotation By k = Anti-clockwise
    static void leftRotate(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0) return;
        k %= n;
        Collections.reverse(arr.subList(0, k));
        Collections.reverse(arr.subList(k, n));
        Collections.reverse(arr);
    }

    // !Right rotation By k = clockwise
    static void rightRotate(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0) return;
        k %= n;
        Collections.reverse(arr);
        Collections.reverse(arr.subList(0, k));
        Collections.reverse(arr.subList(k, n));
    }

    public static void main(String[] args) {
        //-> Test Case 1: Left rotation
        Integer k[] = {1, 2, 3, 4, 5};
        var list = Arrays.asList(k);
        ArrayList<Integer> arr1 = new ArrayList<>(list);
        // ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k1 = 2;
        leftRotate(arr1, k1);
        System.out.println(arr1); // Expected: 3 4 5 1 2

        //->  Test Case 2: Right rotation
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k2 = 2;
        rightRotate(arr2, k2);
        System.out.println(arr2); // Expected: 4 5 1 2 3

        //->  Test Case 3: Left rotation with k > n
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int k3 = 7;
        leftRotate(arr3, k3);
        System.out.println(arr3); // Expected: 2 3 4 5 6 1

        //->  Test Case 4: Right rotation with k > n
        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int k4 = 8;
        rightRotate(arr4, k4);
        System.out.println(arr4); // Expected: 5 6 1 2 3 4
    }
}