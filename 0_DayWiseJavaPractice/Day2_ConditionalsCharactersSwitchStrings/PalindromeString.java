public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String original = str;
        String reversed = new StringBuilder(str).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}