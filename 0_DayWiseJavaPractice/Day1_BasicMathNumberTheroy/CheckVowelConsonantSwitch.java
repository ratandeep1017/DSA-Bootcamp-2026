public class CheckVowelConsonantSwitch {

    public static String checkVowelConsonantSwitch(char ch) {
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return "Vowel";
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return "Consonant";
            default:
                return "Invalid character";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkVowelConsonantSwitch('A')); // Vowel
        System.out.println(checkVowelConsonantSwitch('b')); // Consonant
        System.out.println(checkVowelConsonantSwitch('e')); // Vowel
        System.out.println(checkVowelConsonantSwitch('z')); // Consonant
    }
}