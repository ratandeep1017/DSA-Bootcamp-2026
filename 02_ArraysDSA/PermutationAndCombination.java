import java.util.Scanner;

public class PermutationAndCombination {
    public static long fact(int x) {
        long f = 1;
        for (int i = 1; i <= x; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ncr = fact(n) / (fact(r) * fact(n-r));
        long npr = fact(n) / fact(n-r);
        System.out.println(ncr + " " + npr);
    }
}