
import java.util.ArrayList;
public class DigitsInArrayList {
    public static void main(String[] args) {
        int n = 33203;
        int sum = 0;
        ArrayList<Integer> digits = new ArrayList<>();

        if (n < 0) n = -n;
        if (n == 0) digits.add(0);
        else {
            while (n != 0) {
                int d = n % 10;
                sum += d;
                digits.add(0, d);
                n /= 10;
            }
        }
        System.out.println("Digits: " + digits + " , Sum: " + sum);
    }
}