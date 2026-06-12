import java.util.ArrayList;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Ratan How Are You";

        //!NO LOOP + STRING BUILDER FUNCTION + REVERSE FUNCTION
        StringBuilder reve = new StringBuilder(str).reverse();
        System.out.println("Reverse string 0 : " + reve);

        //!ANOTHER APPROACH WITH STRINGBUILDER TO DIRECTLY STORE A REVERSED STRING IN A STRING
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            rev.append(str.charAt(i));
        String reversed2 = rev.toString();
        System.out.println("Reverse String 1 : " + reversed2);

        //-----------------------------------------------------------------------
        ArrayList<Character> revstr = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) revstr.add(str.charAt(i));
        
        //!USING STORED VALUE FROM ARRAYLIST AND THEN STORING THEM IN a valid string
        StringBuilder sb = new StringBuilder();
        for (char c : revstr) sb.append(c);
        String reversed = sb.toString();
        System.out.println("Reverse String 2 : " + reversed);
        
        //!ONLY STORING IN ARRAYLIST AND PRINTING IN REVERSE NO MANIPULATION
        System.out.println(revstr);        
        revstr.forEach(item -> System.out.print(item));
    }

}

