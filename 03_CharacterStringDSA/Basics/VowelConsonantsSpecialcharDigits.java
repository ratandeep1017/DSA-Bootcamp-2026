package CharacterStringDSA;
import java.util.ArrayList;

public class VowelConsonantsSpecialcharDigits {
    public static void main(String[] args) {
        String str = "Hello, Ratan! How Are You? 1920";
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> conso = new ArrayList<>();
        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits.add(ch);
                continue;
            }
            if (!Character.isLetter(ch)) {
                specialChar.add(ch);
                continue;
            }
            // ----------------
            if ("AEIOUaeiou".indexOf(ch) != -1) vowels.add(ch);
            else conso.add(ch);
            // ----------------
            if (Character.isUpperCase(ch)) upperCase.add(ch);
            else lowerCase.add(ch);
        }

        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + conso);
        System.out.println("upperCase Letter : " + upperCase);
        System.out.println("lowerCase Letter : " + lowerCase);
        System.out.println("Digits : " + digits);
        System.out.print("Special Characters : ");
        specialChar.forEach(item -> System.out.print("[" + item + "]"));

    }

}
