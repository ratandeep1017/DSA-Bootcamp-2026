import java.util.Scanner;
import java.util.ArrayList;
class hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++) nums.add(sc.nextInt());
        int idx = sc.nextInt();
        if(idx > n) System.out.println("Invalid position. Deletion not possible.");
        else {
            nums.remove(idx-1);
            for(int i=0; i<n-1; i++) 
            System.out.print(nums.get(i));
        }   
    }
}