// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,. . . ]
// The 5th missing positive integer is 9.
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int missing = arr[mid] - (mid+1);
            if (missing < k) low = mid + 1;
            else high = mid - 1;
        }
        return low + k;

        // ArrayList<Integer> list = new ArrayList<>();
        // for (int num : arr) list.add(num);
        // int num = 1, count = 0;
        // while (true) {
        //     if (!list.contains(num)) {
        //         count++;
        //         if (count == k) return num;
        //     }
        //     num++;
        // }
    }
}
