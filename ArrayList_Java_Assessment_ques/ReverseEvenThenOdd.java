import java.util.ArrayList;
import java.util.Scanner;
class ReverseEvenThenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i=0; i<n; i++) nums.add(sc.nextInt()); 
        for(int i=n-1; i>=0; i--) {
            int val = nums.get(i);; 
            if(val%2!=0) odd.add(val);
            else even.add(val);
        }
        for(int i=0; i<even.size(); i++) System.out.print(even.get(i)+" ");
        for(int i=0; i<odd.size(); i++)  System.out.print(odd.get(i) +" ");
    }
}