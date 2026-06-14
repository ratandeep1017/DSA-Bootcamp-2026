public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        boolean sorted = true;
        
        //!Ensure each element is not smaller than the previous one.
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        
        if (sorted) System.out.println("Array is sorted (non-decreasing).");
        else System.out.println("Array is NOT sorted.");
    }
}
