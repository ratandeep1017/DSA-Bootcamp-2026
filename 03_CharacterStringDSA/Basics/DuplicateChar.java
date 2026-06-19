package CharacterStringDSA;
import java.util.*;

public class DuplicateChar {
    public static void printDuplicates(ArrayList<Character> list) {
        ArrayList<Character> unique = new ArrayList<>();
        ArrayList<Character> duplicate = new ArrayList<>();
        for (Character x : list)
            if (!unique.contains(x))
                // If character appears first time → put in unique
                unique.add(x);
            else if (!duplicate.contains(x)){
                    // If it appears again → put in duplicate (but only once)
                    duplicate.add(x);
            }
        System.out.println("Unique Characters: " + unique);
        System.out.println("Duplicate Characters: " + duplicate);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine().toLowerCase();
        String str = "Hello World 123 1 2 3 , % #  pl";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                list.add(ch);
        }
        System.out.println(list);
        printDuplicates(list);
    }
}