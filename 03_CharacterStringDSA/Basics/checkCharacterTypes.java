
public class checkCharacterTypes{
    public static String check(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase";
        else if (Character.isLowerCase(ch)) return "Lowercase";
        else return "Special Character";
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(check('A'));   // Upperca2se
        System.out.println(check('a'));   // Lowercase
        System.out.println(check('@'));   // Special Character
        System.out.println(check('5'));   // Special Character
    }
}