import java.util.ArrayList;
import java.util.Scanner;
class CheckPrefixRemoveElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> strs = new ArrayList<>();
        for(int i=0; i<n; i++) strs.add(sc.next());
        String chk = sc.next();
        for(int i=n-1; i>=0; i--) {
            String check = strs.get(i);
            if(check.charAt(0) != chk.charAt(0) || check.charAt(1) != chk.charAt(1))
            System.out.println("Roll: "+ strs.get(i));   
        }
    }
}