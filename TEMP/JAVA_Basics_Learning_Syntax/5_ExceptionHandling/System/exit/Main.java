package System.exit;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("IF");
            System.exit(1);
            System.out.println("Exit(1)");
        } else {
            System.out.println("ELSE");
            System.exit(0);
            System.out.println("Exit(0)");
        }
    }
}
