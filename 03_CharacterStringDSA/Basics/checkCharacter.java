package CharacterStringDSA;
public class checkCharacter {
    //USING ASCII VALUES
    public static String check(char ch) {
        if (ch >= 65 && ch <= 90) return "Uppercase";
        else if (ch >= 97 && ch <= 122) return "Lowercase";
        else return "Special Character";
    }
    //USING CHARACTER
    public static String check2(char ch) {
        if (ch >= 'A' && ch <= 'Z') return "Uppercase";
        else if (ch >= 'a' && ch <= 'z') return "Lowercase";
        else return "Special Character";
    }
    
    public static void main(String[] args) {
        System.out.println(check('A'));   // Uppercase
        System.out.println(check('a'));   // Lowercase
        System.out.println(check2('@'));   // Special Character
        System.out.println(check2('5'));   // Special Character
    }
}