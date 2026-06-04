import java.util.Scanner; 
import java.util.ArrayList;
class hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0; i<n; i++) nums.add(sc.nextInt());

        System.out.println("List in original order:");
        for(int i=0; i<n; i++)  System.out.print(nums.get(i));

        System.out.println();

        System.out.println("List in reverse order:");
        for(int i=n-1; i>=0; i--) System.out.print(nums.get(i));
    }
}