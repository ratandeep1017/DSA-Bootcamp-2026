import java.util.Scanner;

public class CountVowelsConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String ch = sc.nextLine().toLowerCase();
        int count = 0;

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        System.out.println("Vowels: " + count);
        System.out.println("Consonents: " + (26 - count));
        sc.close();
    }
}
//----------------------------------------------------------------
//  switch (ch.charAt(i)) {
//  case 'a':
//  case 'e':
//  case 'i':
//  case 'o':
//  case 'u':
//      count++;
//      break;
// }