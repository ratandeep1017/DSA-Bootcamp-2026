import java.util.Scanner;

public class palindrome1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--)  rev += s.charAt(i);
        if (s.equals(rev)) System.out.println("\"" + s + "\" is a palindrome.");
        else System.out.println("\"" + s + "\" is not a palindrome.");
    }
}

