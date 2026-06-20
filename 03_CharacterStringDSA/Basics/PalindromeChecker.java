import java.util.Scanner;

public class PalindromeChecker {
    
    //!Method 1: Reverse and compare
    public static void palindrome1(String s) {
        String rev = "";
        for (int i = s.length()-1; i>=0; i--) rev += s.charAt(i);
        if (s.equals(rev))  System.out.println(s + " is a palindrome (Method 1).");
        else System.out.println(s + " is not a palindrome (Method 1).");
    }
    
    //!Method 2: Two-pointer comparison
    public static void palindrome2(String s) {
        int last = s.length()-1;
        int flag = 0;
        for (int i = 0; i < last; i++, last--) {
            if (s.charAt(i) != s.charAt(last)) {
                flag = 0;
                break;
            }   flag = 1;
        }
        if (flag != 0) System.out.println(s + " is a palindrome (Method 2).");
         else System.out.println(s + " is not a palindrome (Method 2).");
        
    }
    
    //!Method 3: StringBuilder reverse
    public static void palindrome3(String s) {
        String original = s;
        StringBuilder sb = new StringBuilder(s).reverse();
        String reversed = sb.toString();
        if (original.equals(reversed)) System.out.println(original + " is a palindrome (Method 3).");
        else System.out.println(original + " is not a palindrome (Method 3).");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome:");
        String input = sc.nextLine().toLowerCase();        
        palindrome1(input);
        palindrome2(input);
        palindrome3(input);
        sc.close();
    }
}