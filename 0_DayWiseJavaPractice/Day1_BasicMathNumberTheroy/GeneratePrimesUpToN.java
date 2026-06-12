import java.util.ArrayList;

public class GeneratePrimesUpToN {
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;    
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) 
            if (num % i == 0) return false;
        return true;
    }
    
    public static ArrayList<Integer> generatePrimesUpToN(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) 
            if (isPrime(i)) primes.add(i);
        return primes;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(generatePrimesUpToN(20));   // [2, 3, 5, 7, 11, 13, 17, 19]
        System.out.println(generatePrimesUpToN(10));   // [2, 3, 5, 7]
        System.out.println(generatePrimesUpToN(5));    // [2, 3, 5]
    }
}