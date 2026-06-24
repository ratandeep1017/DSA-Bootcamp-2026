import java.util.*;
public class Solution {
    public static int[] IntersectionOfArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums11 = new ArrayList<>();
        ArrayList<Integer> nums22 = new ArrayList<>();
        for(int ele :  nums1) nums11.add(ele);
        for(int ele :  nums2) nums22.add(ele);

        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<nums11.size(); i++){
            int val = nums11.get(i);
            if(nums22.contains(val) && !output.contains(val))
                output.add(val);
        }

        //Convert integer arraylist to array
        int[] arr = new int[output.size()];
        for (int i = 0; i < output.size(); i++) 
            arr[i] = output.get(i);
        
        //Return the array
        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};

        int arr[] = IntersectionOfArray(nums1,nums2);
        System.out.println(Arrays.toString(arr));
    }
}