import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped) break;
            
        }
    } 

    public static void main(String[] args) {
        int[] data = { 10, 2, 8, 6, 4, 1 };
        System.out.println("Before Bubble Sort: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("After Bubble Sort: " + Arrays.toString(data));
    }
}
