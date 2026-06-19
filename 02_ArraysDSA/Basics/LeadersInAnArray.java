//An element is a Leader if it is greater than or equal to all the elements to its right side.
//Input: arr[] = [16, 17, 4, 3, 5, 2] -> Output: [17 5 2]
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        //! Rightmost element is always a leader so, Start with the rightmost element
        int maxRight = arr[n-1];
        result.add(maxRight);
        //! Traverse the array from right second element(n-2) to left
        for (int i = n-2; i >= 0; i--) 
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        //! Reverse the result list to maintain original order
        Collections.reverse(result);
        System.out.print(result);
    }
}