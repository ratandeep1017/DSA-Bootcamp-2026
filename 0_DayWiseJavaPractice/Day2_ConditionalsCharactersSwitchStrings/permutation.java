import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            System.out.println("All permutations of string: " + str);
            find(str, "");
    }
    
    public static void find(String str, String prefix) {
        int len = str.length();
        if (len == 0) System.out.println(prefix);
         else {
            for (int i=0; i<len; i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                find(remaining, prefix + ch);
            }
        }
    }
}