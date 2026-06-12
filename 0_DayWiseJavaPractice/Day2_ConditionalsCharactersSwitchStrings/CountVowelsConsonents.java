import java.util.ArrayList;
import java.util.Scanner;

public class CountVowelsConsonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> consonants = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels.add(c);
            else if (Character.isLetter(c)) consonants.add(c);
        }

        System.out.println("vowels: " + vowels);
        System.out.println("consonants: " + consonants);
        System.out.println("Vowels: " + vowels.size());
        System.out.println("Consonants: " + consonants.size());
        sc.close();
    }
}