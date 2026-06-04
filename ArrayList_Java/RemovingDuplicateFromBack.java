// You are using Java
import java.util.ArrayList;
import java.util.Scanner;
class RemovingDuplicateFromBack{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums_no = new ArrayList<>();
        for(int i=0; i<n; i++) {
            nums.add(sc.nextInt());
        };
        for(int i=n-1; i>=0; i--) {
             int x = nums.get(i);  
             if(nums_no.contains(x)) continue;
             else nums_no.add(x);
            }
        for(int i=0; i<nums_no.size(); i++) System.out.print(nums_no.get(i)+" ");
    }
}