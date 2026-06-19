// [10 65 23 56 78]
// target = 11
// Output = 65 (6+5=11(target))
import java.util.Scanner;
import java.util.ArrayList;
class DigitSumToTargetInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> vals = new ArrayList<>();
        for(int i=0; i<n; i++) vals.add(sc.nextInt());
        int target = sc.nextInt();
        int flag=0, rem=0, quot=0, val=0;
        for(int i=0; i<n; i++){
            val = vals.get(i);
            rem = val/10;
            quot = val%10;
            if(target == rem+quot) { 
                flag = val; break;
            }
        }
        if(flag!=0) System.out.print(flag);
        else System.out.print(-1);
    }
}