public class CheckValidTriangle {
    public static boolean check(int angle1, int angle2, int angle3) {
        return (angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0);
    }

    public static boolean checkSides(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && (a > 0 && b > 0 && c > 0);
    }

    public static void main(String[] args) {
        System.out.println(check(60, 60, 60)); // true
        System.out.println(check(100, 50, 20)); // false

        System.out.println(checkSides(3, 4, 5)); // true
        System.out.println(checkSides(1, 2, 10)); // false
    }
}