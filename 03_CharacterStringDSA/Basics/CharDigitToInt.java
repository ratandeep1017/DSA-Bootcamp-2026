package CharacterStringDSA;

// | Operation       | Code Pattern                                                |
// | --------------- | ----------------------------------------------------------- |
// | Char → ASCII    | int ascii = (int) ch; or int ascii = ch; programiz+1        |
// | ASCII → Char    | char c = (char) value; baeldung                             |
// | Digit → int     | int num = ch - '0';                                         |
// | Upper → Lower   | (char) (ch + 32)                                            |
// | Lower → Upper   | (char) (ch - 32)                                            |
// | Toggle Case     | (char) (ch ^ 32) geeksforgeeks                              |
// | Frequency Array | count[char]++ (char auto-converts to ASCII) copyprogramming |



import java.util.*;
public class CharDigitToInt {
    public static void main(String[] args) {
        char digit = '7';
        int num = digit - '0'; // Subtract '0' (ASCII 48) to get integer value
        System.out.println(digit + " as int = " + num); // 7 as int = 7
    }
}