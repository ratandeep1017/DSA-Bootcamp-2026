class Solution {
    public static void leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] right = new int[n];
        int[] left = new int[n];
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += nums[i];      
            left[i] = sum;       
        }
        sum = 0;
        for (int i = n-1; i >= 0; i--) {
            sum += nums[i];     
            right[i] = sum;     
        }


        for(int ele:right) System.out.print(ele+" ");
        for(int ele:left) System.out.print(ele+" ");
    }
//25 15 11 3
    public static void main(String[] args) {
        int[] arr = { 10, 4, 8, 3 };
        leftRightDifference(arr);
    }
}