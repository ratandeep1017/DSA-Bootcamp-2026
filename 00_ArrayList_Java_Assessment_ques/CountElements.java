import java.util.*;
class hello{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int x = sc.nextInt();
            nums.add(x);
            if(x==-1) break;
        }
        System.out.println(nums.size()-1);
    }
}