public class SecondLargestWithDuplicates {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 19, 10, 100, 9, 0 };
        if (arr.length < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        int largest = 0;
        int large2 = 0;

        for (int x : arr) {
            if (x > largest) {
                large2 = largest;
                largest = x;
            } else if ((x < largest) && (x > large2)) large2 = x;
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + large2);
    }
}
