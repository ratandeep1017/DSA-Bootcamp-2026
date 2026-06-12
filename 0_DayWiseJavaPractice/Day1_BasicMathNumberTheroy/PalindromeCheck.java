public class PalindromeCheck {
    public static boolean isPalindromeNumber(int n) {
        if (n < 0) return false; // negative numbers: not considered palindrome
        if (n < 10) return true; // single digit: always palindrome

        int original = n;
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int[] numbers = { 121, 123, 1331, 1001, 12, 7, 242 };
        for (int num : numbers)
            if (isPalindromeNumber(num)) System.out.println(num + ": Palindrome");
            else System.out.println(num + ": Not Palindrome");
    }
}
