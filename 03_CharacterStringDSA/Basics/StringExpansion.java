package CharacterStringDSA;
public class StringExpansion {
    static int index = 0;
    public static String decode(String s) {
        String result = "";
        while (index < s.length() && s.charAt(index) != ']') {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int count = 0;
                while (index < s.length() && Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++; // skip '['
                String inner = decode(s);
                index++; // skip ']'
                String repeated = "";
                for (int i = 0; i < count; i++) repeated += inner;
                result += repeated;
            } else {
                result += ch;
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        index = 0;
        System.out.println(decode("3[a2[c]]"));
    }
}