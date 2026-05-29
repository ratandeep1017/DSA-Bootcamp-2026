import java.util.Scanner;
public class palindrome2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        
        int last = s.length()-1;
        int flag = 0;
        for(int i=0; i<last;i++,last--)
            if(s.charAt(i) != s.charAt(last)) {
                flag=0; break;
            }
        if (flag!=0) System.out.println("\"" + s + "\" is a palindrome.");
        else System.out.println("\"" + s + "\" is not a palindrome.");
    }
}

