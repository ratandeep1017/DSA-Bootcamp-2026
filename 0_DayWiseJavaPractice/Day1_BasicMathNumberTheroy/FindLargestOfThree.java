public class FindLargestOfThree {
    public static int find(int a, int b, int c) {
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        return largest;
    }
    public static void main(String[] args) {
        System.out.println(find(5, 10, 3));   // 10
        System.out.println(find(7, 7, 7));    // 7
    }
}