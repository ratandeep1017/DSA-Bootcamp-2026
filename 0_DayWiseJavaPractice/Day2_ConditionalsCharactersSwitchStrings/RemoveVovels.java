import java.util.Scanner;

public class RemoveVovels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'U')
                continue;
            else System.out.print(s.charAt(i));   
        }
    }
}
