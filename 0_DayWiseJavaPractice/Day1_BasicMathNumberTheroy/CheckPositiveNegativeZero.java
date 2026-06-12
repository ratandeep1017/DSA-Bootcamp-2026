public class CheckPositiveNegativeZero {
    public static String check(int num) {
        if (num > 0) return "Positive";
        else if (num < 0) return "Negative";
        else return "Zero";
    }
    public static void main(String[] args) {
        System.out.println(check(10));   // Positive
        System.out.println(check(-5));   // Negative
        System.out.println(check(0));    // Zero
    }
}