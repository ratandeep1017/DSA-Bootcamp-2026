public class PrintBasicNumbers {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = n; i >= 0; i--) System.out.print(i + " ");
        System.out.println();
        for (int i = n; i > 0; i--) System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < n; i++) System.out.print(i + " ");
    }
}
