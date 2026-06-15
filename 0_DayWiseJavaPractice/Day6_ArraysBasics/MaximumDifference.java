public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        if (arr.length < 2) {
            System.out.println("Not enough elements");
            return;
        }
        int minSoFar = arr[0];
        int maxDiff = arr[1] - arr[0];
        for (int j = 1; j < arr.length; j++) {
            int diff = arr[j] - minSoFar;
            if (diff > maxDiff)    maxDiff = diff;
            if (arr[j] < minSoFar) minSoFar = arr[j];
        }
        System.out.println("Maximum difference: " + maxDiff);
    }
}
