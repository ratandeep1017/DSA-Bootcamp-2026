public class CheckArraySorted {
    public static boolean desc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] < arr[i + 1]) return false;
        return true;
    }

    public static boolean asc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 5 };
        if (asc(arr))
            System.out.println("Sorted in Ascending order");
        else if (desc(arr))
            System.out.println("Sorted in Descending order");
        else
            System.out.println("NOT sorted.");
    }
}