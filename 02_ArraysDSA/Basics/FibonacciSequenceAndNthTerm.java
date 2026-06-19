//! Maintain two previous terms and keep printing their sum while updating them.
import java.util.ArrayList;
public class FibonacciSequenceAndNthTerm {
    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList<>();
        int n = 10; // number of terms
        int a = 0, b = 1;
        fib.add(a);
        fib.add(b);
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            fib.add(c);
            a = b;
            b = c;
        }
    System.out.println("Fibonacci Sequence till " + n +" is -> " + fib);
    System.out.println("Nth Term: " + fib.get(fib.size()-1));
    }
}