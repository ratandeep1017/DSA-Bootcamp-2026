import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;
        int n = nums1.length + nums2.length; 

        // Merge both sorted arrays using (MERGE SORT)
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) arr.add(nums1[i++]);
            else arr.add(nums2[j++]);
        }
        // Add remaining elements
        while (i < nums1.length) arr.add(nums1[i++]);
        while (j < nums2.length) arr.add(nums2[j++]);

        //Check For Median Element
        if (n % 2 == 1) return arr.get(n / 2);
        return (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;

//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int num : nums1) arr.add(num);
//         for (int num : nums2) arr.add(num);
//         Collections.sort(arr);
//         int n = arr.size();
//         if (n%2 == 1) return arr.get(n/2);
//         else return (arr.get(n/2 - 1) + arr.get(n/2)) / 2.0;
    }
}