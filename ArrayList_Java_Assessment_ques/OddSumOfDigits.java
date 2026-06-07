import java.util.ArrayList;
import java.util.Scanner;
class OddSumOfDigits{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     ArrayList <Integer> nums = new ArrayList<>();
     ArrayList <Integer> ans = new ArrayList<>();
     for(int i=0; i<n ; i++) nums.add(sc.nextInt());
     
     for(int i=0; i<n ; i++) {
         int num = nums.get(i);
         if(num<10 && num%2!=0) System.out.print(num);
         else{
            int rem = num/10;
            int quot = num%10;
            if((rem+quot)%2!=0) System.out.print(num);
        }
      }
    }
}