public class FindminmaxOfThree {
    public static void find(int a, int b, int c) {
        //!With using Math.max , Math.min function
        // int max = Math.max(a, Math.max(b, c));
        // int min = Math.min(a, Math.min(b, c));
        
        //!Without using any function
        int max = a, min = a;
        if (b > max)max = b;
        if (c > max)max = c;
        if (b < min)min = b;
        if (c < min)min = c;
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static void main(String[] args) {
        find(7, 7, 7);
        find(10, 7, 2);
        find(5, 10, 3); // 5
        find(2, 7, 10);
    }
}