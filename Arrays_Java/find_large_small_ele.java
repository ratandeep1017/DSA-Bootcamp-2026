// package Arrays_Java;
import java.util.*;
public class find_large_small_ele {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int max = arr[0], min = arr[0];
        
        for(int i = 1; i < n; i++){  
            if(max < arr[i]) max = arr[i];   
            if(min > arr[i]) min = arr[i];   
        }
        
        System.out.println("Max : " + max + " and Min : " + min);
    }
}