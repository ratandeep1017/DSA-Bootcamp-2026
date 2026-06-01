import java.util.Scanner;
public class FindFirstUniqueChar {

    public static char nonRep(String s, int n) {
        for (int i=0; i<n; i++) {
            boolean found = false;
            for (int j=0; j<n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true; break;
                }
            }
            if (!found) return s.charAt(i);  
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = nonRep(str , str.length());
        if(ch != ' ') System.out.println(ch);
        else System.out.println(-1);
    }
}