public class FindminmaxOfThree {
    public static void find(int a, int b, int c) {
        //!With using Math.max , Math.min function
        // int max = Math.max(a, Math.max(b, c));
        // int min = Math.min(a, Math.min(b, c));

        //!Using nested if else
        // int max,min;
        // if(a>b) {
        //     if(a>c) max = a; else max = c;
        // }else{
        //     if(b>c) max = b; else max = c;
        // }
        // if(a<b) {
        //     if(a<c) min = a; else min = c;
        // }else{
        //     if(b<c) min = b; else min = c;
        // }

        //!Without using any function
        // int max = a, min = a;
        // if (b > max)max = b;
        // if (c > max)max = c;

        // if (b < min)min = b;
        // if (c < min)min = c;

        //! in a single line 
        int max = (a>b) ? ((a>c) ? a: c) : ((b>c) ? b:c);
        int min = (a<b) ? ((a<c) ? a: c) : ((b<c) ? b:c);
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static void main(String[] args) {
        find(7, 7, 7);
        find(10, 7, 2);
        find(5, 10, 3); // 5
        find(2, 7, 10);
    }
}