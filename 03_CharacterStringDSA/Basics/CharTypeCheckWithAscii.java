package CharacterStringDSA;
import java.util.Scanner;

public class CharTypeCheckWithAscii {

    public static void checkChar(char ch) {
        System.out.print("[" + ch + "] is ");
        if (ch >= '0' && ch <= '9')      System.out.println("Digit");
        else if (ch >= 'A' && ch <= 'Z') System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z') System.out.println("Lowercase Letter");
        else                             System.out.println("Special Character");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        checkChar(ch);
        int ascii = (int) ch;
        System.out.println("ASCII value of character [" + ch + "] is : " + ascii);
    }
}