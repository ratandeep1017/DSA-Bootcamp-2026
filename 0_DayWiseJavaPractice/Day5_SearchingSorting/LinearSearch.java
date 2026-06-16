public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i=0; i < arr.length; i++) 
            if (arr[i] == target) return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] data = { 7, 3, 5, 9, 1, 4, 8 };
        int target = 9;

        int index = linearSearch(data, target);
        if (index != -1) System.out.println("Linear search: found " + target + " at index " + index);
        else System.out.println("Linear search: " + target + " not found.");
    }
}
