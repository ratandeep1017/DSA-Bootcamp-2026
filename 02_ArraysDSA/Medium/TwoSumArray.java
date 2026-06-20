//!Not a Better Approach - use hashset For better
public class TwoSumArray {
    public static void twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (nums[i] + nums[j] == target) {
                    System.out.println("Element is at index: [" + i + "] , [" + j + "]");
                    return;
                }
        System.out.println("Target Sum Not Found");
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 92;
        twoSum(nums, target);
    }
}