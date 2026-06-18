public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; //! divisible by 2, not prime
        
        //! Check only odd numbers up to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) 
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 10, 11, 13, 17, 29, 30};
        for (int num : numbers) 
            if (isPrime(num))System.out.println(num + " is a Prime number");
            else  System.out.println(num + " is a composite number");
    }
}