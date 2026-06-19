package CharacterStringDSA;
public class CheckVowelConsonant {
    public static String check(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        } else return "Not a valid alphabet";
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(check('A'));   // Vowel
        System.out.println(check('b'));   // Consonant
    }
}