import java.util.Arrays;
class FrequencyCountSortedUnsorted {
    // ! METHOD 2
    public static void FrequencySorted(int arr[]) {
        Arrays.sort(arr); // * This method will Work On Only Sorted Array
        int n = arr.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            // check if next element is same
            if ((i < n - 1) && (arr[i] == arr[i + 1]))
                count++;
            else {
                System.out.println(arr[i] + " -> " + count);
                count = 1;
            }
        }
    }
    public static void FrequencyUnsorted(int arr[]) {
        
        // ! find maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max) max = arr[i];

        // ! create new array = (java already initialize all elements of array to zero)
        int arr1[] = new int[max + 1];
        // ! count frequency
        for (int ele : arr) arr1[ele]++;

        for (int i = 0; i <= max; i++)
            if (arr1[i] != 0)
                System.out.println(i + " -> " + arr1[i]);
    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 11, 12, 11, 50, 12, 19, 13, 10, 10, 50, 50, 50 };
        System.out.println("After Sorting The Array");
        FrequencySorted(arr);
        System.out.println("In Unsorted Array");
        FrequencyUnsorted(arr);
    }
}