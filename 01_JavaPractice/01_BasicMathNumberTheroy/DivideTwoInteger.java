public class DivideTwoInteger {
    public int divide(int dividend, int divisor) {
        double num = (double)dividend / (double)divisor;
        return (int)num;

        // long num = dividend / divisor;
        // if (dividend == Integer.MIN_VALUE && divisor == -1) 
        //     return Integer.MAX_VALUE;
        // return (int) num;
    }
}
