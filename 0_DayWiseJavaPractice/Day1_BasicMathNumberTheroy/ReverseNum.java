public class ReverseNum {
    public static void main(String[] args) {
        int n = 1286;
        int r = 0;
        while (n != 0) {
            r *= 10;
            r += n % 10;
            n /= 10;
        }
        System.out.println(r);
    }
}
