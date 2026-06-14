public class SecondLargestWithDuplicates {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 19, 10, 100, 9 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > largest) {
                // Move old largest to second only if it's different from new largest
                if (x != largest)  secondLargest = largest;
                largest = x;
            } else if (x < largest && x > secondLargest) secondLargest = x;
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}