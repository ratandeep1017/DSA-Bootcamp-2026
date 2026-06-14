
public class CountDigits {
    public static int count(int n) {
        int count = 0;
        if (n == 0) count = 1;
        else {
            if (n < 0) n = -n;
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of digits: " + count(19292));
        System.out.println("Number of digits: " + count(34));
        System.out.println("Number of digits: " + count(2));
        System.out.println("Number of digits: " + count(123));
    }
}