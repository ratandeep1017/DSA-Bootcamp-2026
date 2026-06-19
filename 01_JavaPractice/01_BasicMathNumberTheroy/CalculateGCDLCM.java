public class CalculateGCDLCM {
    
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            return 0;
        }
        return (a * b) / gcd(a, b);
    }
    
    public static int[] calculateGcdAndLcm(int a, int b) {
        int g = gcd(a, b);
        int l = lcm(a, b);
        return new int[]{g, l};
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] result1 = calculateGcdAndLcm(12, 18);
        System.out.println("GCD: " + result1[0]);   // 6
        System.out.println("LCM: " + result1[1]);   // 36
        
        int[] result2 = calculateGcdAndLcm(24, 36);
        System.out.println("GCD: " + result2[0]);   // 12
        System.out.println("LCM: " + result2[1]);   // 72
    }
}