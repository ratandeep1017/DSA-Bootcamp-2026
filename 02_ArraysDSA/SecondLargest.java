public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 19, 10, 100, 9, 0 };
        if (arr.length < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }
        int largest = Integer.MIN_VALUE, large2 = Integer.MIN_VALUE;

        // ! METHOD 1: Main Code Logic
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > largest)
                largest = arr[i]; //Find Max

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > large2 && arr[i] != largest)
                large2 = arr[i]; //Find 2nd Largest Except Max

        // ! METHOD 2: Using Single Loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                large2 = largest; // old largest becomes 2nd largest
                largest = arr[i]; // update largest
            } else if (arr[i] > large2 && arr[i] != largest)
                large2 = arr[i];
        }
        // ! METHOD 3: Using For Each Loop
        for (int ele : arr) {
            if (ele > largest) {
                large2 = largest;
                largest = ele;
            } else if ((ele > large2) && (ele != largest))
                large2 = ele;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + large2);
    }
}
