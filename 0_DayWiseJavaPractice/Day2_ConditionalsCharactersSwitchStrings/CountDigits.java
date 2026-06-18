
public class CountDigits {
    public static void count(int n) {
        int count = 0, sum = 0;
        if (n == 0) count = 1;
        if (n < 0) n = -n;
        while (n != 0) {
                count++;
                sum += n%10;
                n /= 10;
            }
            System.out.println("Number of digits: " + count + ", SUM: " + sum);
        }

    public static void main(String[] args) {
        count(2);
        count(34);
        count(123);
        count(19292);
        count(-10);
    }
}