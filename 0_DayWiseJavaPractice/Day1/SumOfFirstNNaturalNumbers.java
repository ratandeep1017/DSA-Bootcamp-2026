public class SumOfFirstNNaturalNumbers {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        // Test cases
        System.out.println(sum(5));   // 15
        System.out.println(sum(10));  // 55
        System.out.println(sum(1));   // 1
    }
}